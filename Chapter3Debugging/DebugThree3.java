import java.util.Scanner;

public class DebugThree3 {
    public static void main(String args[]) {
        // Declare a variable to store the user's name
        String name;

        // Get the user's name by calling getName()
        name = getName();

        // Display a greeting with the user's name
        displayGreeting(name);           
    }

    // Method to get the user's name from input
    public static String getName() {
        // Declare a variable to store the name
        String name;

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter name: ");

        // Get the name entered by the user
        name = input.nextLine();

        // Return the name
        return name;
    }

    // Method to display a greeting message with the user's name
    public static void displayGreeting(String name) {
        // Display the greeting message
        System.out.println("Hello, " + name + "!");
    }
}
