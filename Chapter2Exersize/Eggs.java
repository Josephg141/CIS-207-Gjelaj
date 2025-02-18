import java.util.Scanner;  // Import Scanner class for user input

public class Eggs {
    public static void main(String[] args) {
        // Constants for prices
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_PER_EGG = 0.45;
        final int EGGS_IN_DOZEN = 12;
        
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of eggs
        System.out.print("Enter the number of eggs in the order: ");
        int totalEggs = scanner.nextInt();  // Read the user input
        
        // Calculate the number of dozens and remaining loose eggs
        int dozens = totalEggs / EGGS_IN_DOZEN;  // Number of full dozens
        int looseEggs = totalEggs % EGGS_IN_DOZEN;  // Remaining loose eggs
        
        // Calculate the total cost
        double totalCost = (dozens * PRICE_PER_DOZEN) + (looseEggs * PRICE_PER_EGG);
        
        // Display the result with an explanation
        System.out.println("\nYou ordered " + totalEggs + " eggs.");
        if (dozens > 0) {
            System.out.println("That's " + dozens + " dozen at $" + PRICE_PER_DOZEN + " per dozen.");
        }
        if (looseEggs > 0) {
            System.out.println("And " + looseEggs + " loose egg(s) at $" + PRICE_PER_EGG + " each.");
        }
        System.out.printf("The total amount owed is: $%.2f\n", totalCost);
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}
