import java.util.Scanner;

public class FormLetterWriter {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the first and last name
        String firstName, lastName;

        // Prompt the user for the first name
        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();

        // Prompt the user for the last name
        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        // Test the first overloaded method (with one String parameter)
        displaySalutation(firstName);

        // Test the second overloaded method (with two String parameters)
        displaySalutation(firstName, lastName);

        // Close the scanner
        scanner.close();
    }

    // First overloaded method - accepts one String parameter (first name)
    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        System.out.println("Thank you for your recent order.\n");
    }

    // Second overloaded method - accepts two String parameters (first name and last name)
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.\n");
    }
}
