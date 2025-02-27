import java.util.Scanner;

public class DebugThree2 {
    public static void main(String args[]) {
        // Declare variables for the three integers
        int a, b, c;
        
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the first integer
        System.out.print("Enter an integer >> ");
        a = input.nextInt();
        
        // Prompt the user for the second integer
        System.out.print("Enter a second integer >> ");
        b = input.nextInt();
        
        // Prompt the user for the third integer
        System.out.print("Enter a third integer >> ");
        c = input.nextInt();
        
        // Call the add and subtract methods
        add(a, b);
        add(b, c);
        add(a, c);
        
        subtract(a, b);
        subtract(b, c);
        subtract(a, c);  
    }

    // Method to add two numbers and display the result
    public static void add(int a, int b) {
        int sum = a + b;  // Calculate the sum
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    // Method to subtract two numbers and display the result
    public static void subtract(int a, int b) {
        int difference = a - b;  // Calculate the difference
        System.out.println("The difference between " + a + " and " + b + " is " + difference);
    }
}
