import java.util.Scanner;

public class DebugSix2 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      char letter;
      int a;
      int min;
      final int MAX = 122;
      final int NUMBERLINE = 20;
      int lineCount = 0;

      System.out.println("Enter a Unicode value to start.");
      System.out.print("For example, A is 65 >> ");
      min = keyboard.nextInt();

      for(a = min; a <= MAX; a++) {
         letter = (char)a;
         System.out.print("  " + letter);
         lineCount++;

         if(lineCount == NUMBERLINE) {
            System.out.println();
            lineCount = 0;
         }
      }

      System.out.println("\nEnd of application");
   }
}
