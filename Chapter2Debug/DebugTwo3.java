import java.util.Scanner;

public class DebugTwo3 {
    public static void main(String args[]) {
        int a, b;
        int result, remainder;

        // Use try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer >> ");
            a = input.nextInt();  // Corrected: added parentheses for method call
            
            System.out.print("Enter another integer >> ");
            b = input.nextInt();  // Corrected: added parentheses for method call
            
            // Proper assignment of result and remainder
            result = a / b;        // Division result
            remainder = a % b;     // Remainder

            System.out.println("Divide " + a + " by " + b);
            System.out.println("Result is " + result);
            System.out.println("Remainder is " + remainder);
        } // The Scanner is automatically closed at the end of the try block
    }
}
