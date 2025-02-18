import java.util.Scanner; // Import the Scanner class for user input

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        // Declare a constant for the number of quarts in a gallon
        final int QUARTS_IN_GALLON = 4;
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of quarts needed
        System.out.print("Enter the number of quarts needed for the job: ");
        int quartsNeeded = scanner.nextInt(); // Read the user input

        // Calculate the number of gallons and remaining quarts
        int gallons = quartsNeeded / QUARTS_IN_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON;

        // Display the result with explanatory text
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons plus " + remainingQuarts + " quarts.");

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}