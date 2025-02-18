import java.util.Scanner;  // Import Scanner class for user input

public class MilesConversionsInteractive {
    public static void main(String[] args) {
        // Constants for number of inches, feet, and yards in a mile
        final int INCHES_IN_MILE = 63360;  // 5280 feet * 12 inches
        final int FEET_IN_MILE = 5280;    // 1 mile = 5280 feet
        final int YARDS_IN_MILE = 1760;   // 1 mile = 1760 yards
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of miles
        System.out.print("Enter the number of miles: ");
        double miles = scanner.nextDouble();  // Read the user input
        
        // Compute the equivalent values
        double inches = miles * INCHES_IN_MILE;
        double feet = miles * FEET_IN_MILE;
        double yards = miles * YARDS_IN_MILE;
        
        // Display the results with explanatory text
        System.out.println("\nFor " + miles + " miles:");
        System.out.println("Inches: " + inches + " inches");
        System.out.println("Feet: " + feet + " feet");
        System.out.println("Yards: " + yards + " yards");
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}
