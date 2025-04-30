// CountSpaces.java
public class CountSpaces {
    public static void main(String[] args) {
       String quote = "The only way to do great work is to love what you do.";
       int spaceCount = 0;
 
       for(int i = 0; i < quote.length(); i++) {
          if(quote.charAt(i) == ' ') {
             spaceCount++;
          }
       }
 
       System.out.println("Quote: \"" + quote + "\"");
       System.out.println("Total number of spaces: " + spaceCount);
    }
 }
 