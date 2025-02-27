import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for student's name and GPA
        String name;
        double gpa;

        // Prompt the user for the student's name
        System.out.print("Enter the student's name: ");
        name = scanner.nextLine();

        // Prompt the user for the student's grade point average (GPA)
        System.out.print("Enter the student's GPA: ");
        gpa = scanner.nextDouble();

        // Call the method to display the credit message
        displayCredit(name, gpa);

        // Close the scanner
        scanner.close();
    }

    // Method to display the descriptive message
    public static void displayCredit(String name, double gpa) {
        // Compute the bookstore credit (10 times the GPA)
        double credit = gpa * 10;

        // Display the descriptive message
        System.out.printf("%s has a GPA of %.2f and is awarded a $%.2f bookstore credit.%n", name, gpa, credit);
    }
}
