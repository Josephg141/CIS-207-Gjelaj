import java.util.Scanner;  // Import Scanner class for user input

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        // Constant for the number of inches in one foot
        final int INCHES_IN_FOOT = 12;
        
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the length in inches
        System.out.print("Enter the number of inches: ");
        int inches = scanner.nextInt();  // Read the user input
        
        // Compute the number of feet and remaining inches
        int feet = inches / INCHES_IN_FOOT;         // Integer division to get feet
        int remainingInches = inches % INCHES_IN_FOOT;  // Modulus to get the remaining inches
        
        // Display the result
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}
