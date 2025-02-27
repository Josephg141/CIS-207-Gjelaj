import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable for the number of inches
        double inches;

        // Prompt the user for the value in inches
        System.out.print("Enter the value in inches: ");
        inches = scanner.nextDouble();

        // Call the methods to convert inches to feet and yards
        convertInchesToFeet(inches);
        convertInchesToYards(inches);

        // Close the scanner
        scanner.close();
    }

    // Method to convert inches to feet and display the result
    public static void convertInchesToFeet(double inches) {
        // There are 12 inches in a foot
        double feet = inches / 12;
        System.out.printf("%.2f inches is equal to %.2f feet.%n", inches, feet);
    }

    // Method to convert inches to yards and display the result
    public static void convertInchesToYards(double inches) {
        // There are 36 inches in a yard (3 feet * 12 inches)
        double yards = inches / 36;
        System.out.printf("%.2f inches is equal to %.2f yards.%n", inches, yards);
    }
}
