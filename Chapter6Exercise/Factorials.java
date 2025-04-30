import java.util.Scanner;

public class Factorials {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int limit;

      System.out.print("Enter an integer limit (1 to 16) >> ");
      limit = input.nextInt();

      while(limit < 1 || limit > 16) {
         System.out.print("Please enter a value between 1 and 16 >> ");
         limit = input.nextInt();
      }

      for(int i = 1; i <= limit; i++) {
         int factorial = 1;
         for(int j = 1; j <= i; j++) {
            factorial *= j;
         }
         System.out.println(i + "! = " + factorial);
      }
   }
}
