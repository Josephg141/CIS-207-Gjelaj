import java.util.Scanner;

public class MadLibWithMethod {
    public static void main(String[] args) {
        // Declare variables to store the user inputs
        String animal;
        int number;
        String direction;
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the necessary words
        System.out.print("Enter the name of an animal: ");
        animal = input.nextLine();
        
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        input.nextLine();  // Consume the leftover newline character
        
        System.out.print("Enter a direction: ");
        direction = input.nextLine();
        
        // Call the method to display the Mad Lib story
        displayMadLib(animal, number, direction);
    }
    
    // Method to display the Mad Lib story
    public static void displayMadLib(String animal, int number, String direction) {
        System.out.println("\nHere is your Mad Lib story:");
        System.out.println("Hickory Dickory Dock,");
        System.out.println("The " + animal + " ran up the clock.");
        System.out.println("The clock struck " + number + ",");
        System.out.println("The " + animal + " ran " + direction + ".");
        System.out.println("Hickory Dickory Dock.");
    }
}
