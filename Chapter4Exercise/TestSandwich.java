import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for sandwich details
        System.out.print("Enter the type of bread: ");
        String breadType = scanner.nextLine();

        System.out.print("Enter the type of filling: ");
        String fillingType = scanner.nextLine();

        System.out.print("Do you want lettuce (yes/no)? ");
        boolean hasLettuce = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Do you want tomato (yes/no)? ");
        boolean hasTomato = scanner.nextLine().equalsIgnoreCase("yes");

        // Create a Sandwich object
        Sandwich mySandwich = new Sandwich(breadType, fillingType, hasLettuce, hasTomato);

        // Display the sandwich details
        mySandwich.displaySandwichDetails();

        // Close the scanner
        scanner.close();
    }
}