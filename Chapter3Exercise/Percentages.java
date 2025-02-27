import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare two double variables
        double num1, num2;

        // Prompt the user for the first double value
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // Prompt the user for the second double value
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        // Call the computePercent method with the numbers in the given order
        computePercent(num1, num2);

        // Call the computePercent method with the numbers in reversed order
        computePercent(num2, num1);

        // Close the scanner
        scanner.close();
    }

    // Method to compute and display the percentage of the first number relative to the second
    public static void computePercent(double num1, double num2) {
        // Calculate the percentage of num1 relative to num2
        double percentage = (num1 / num2) * 100;

        // Display the result
        System.out.printf("%.1f is %.1f percent of %.1f%n", num1, percentage, num2);
    }
}
