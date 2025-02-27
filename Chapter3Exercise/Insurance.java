import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the current year and birth year
        int currentYear, birthYear;

        // Prompt the user for the current year
        System.out.print("Enter the current year: ");
        currentYear = scanner.nextInt();

        // Prompt the user for the birth year
        System.out.print("Enter your birth year: ");
        birthYear = scanner.nextInt();

        // Call the method to calculate the premium and store the result
        double premium = calculatePremium(currentYear, birthYear);

        // Display the premium amount
        System.out.printf("Your annual premium is: $%.2f%n", premium);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the premium based on the current year and birth year
    public static double calculatePremium(int currentYear, int birthYear) {
        // Calculate the customer's age
        int age = currentYear - birthYear;

        // Calculate the decade of the customer's age (the first digit of age)
        int decade = age / 10;

        // Calculate the premium using the formula
        double premium = (decade + 15) * 20;

        return premium;
    }
}
