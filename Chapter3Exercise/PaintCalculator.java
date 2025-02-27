import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the length, width, and height of the room
        double length, width, height;

        // Prompt the user for the length of the room
        System.out.print("Enter the length of the room (in feet): ");
        length = scanner.nextDouble();

        // Prompt the user for the width of the room
        System.out.print("Enter the width of the room (in feet): ");
        width = scanner.nextDouble();

        // Prompt the user for the height of the room
        System.out.print("Enter the height of the room (in feet): ");
        height = scanner.nextDouble();

        // Call the method to calculate and return the price
        double totalPrice = calculatePrice(length, width, height);

        // Display the total price to the user
        System.out.printf("The total cost to paint the room is: $%.2f%n", totalPrice);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the wall area of the room
    public static double calculateWallArea(double length, double width, double height) {
        // Calculate the area of the four walls (two walls with length * height and two walls with width * height)
        double area = 2 * (length * height) + 2 * (width * height);
        return area;
    }

    // Method to calculate the number of gallons of paint needed
    public static double calculateGallonsNeeded(double wallArea) {
        // A gallon of paint covers 350 square feet
        double gallonsNeeded = wallArea / 350;
        return gallonsNeeded;
    }

    // Method to calculate the price of the paint
    public static double calculatePrice(double length, double width, double height) {
        // Calculate the wall area
        double wallArea = calculateWallArea(length, width, height);

        // Calculate the number of gallons of paint needed
        double gallonsNeeded = calculateGallonsNeeded(wallArea);

        // Calculate the price of the paint (paint costs $32 per gallon)
        double price = gallonsNeeded * 32;

        return price;
    }
}
