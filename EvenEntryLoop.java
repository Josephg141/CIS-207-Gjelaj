import java.util.Scanner;

public class EvenEntryLoop {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number;

      System.out.print("Enter an even number or 999 to quit >> ");
      number = input.nextInt();

      while(number != 999) {
         if(number % 2 == 0) {
            System.out.println("Good job!");
         } else {
            System.out.println("Error: That is not an even number.");
         }
         System.out.print("Enter an even number or 999 to quit >> ");
         number = input.nextInt();
      }

      System.out.println("Program ended.");
   }
}
