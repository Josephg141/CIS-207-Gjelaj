// CountSpaces2.java
import java.util.Scanner;

public class CountSpaces2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your favorite quote >> ");
      String quote = input.nextLine();
      int spaceCount = 0;

      for(int i = 0; i < quote.length(); i++) {
         if(quote.charAt(i) == ' ') {
            spaceCount++;
         }
      }

      System.out.println("Total number of spaces in your quote: " + spaceCount);
   }
}
