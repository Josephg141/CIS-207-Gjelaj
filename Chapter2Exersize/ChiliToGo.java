import java.util.Scanner;  // Import Scanner class for user input

public class ChiliToGo {
    public static void main(String[] args) {
        // Constants for the prices of adult and child meals
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;
        
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of adult and child meals
        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = scanner.nextInt();  // Read the number of adult meals
        
        System.out.print("Enter the number of child meals ordered: ");
        int childMeals = scanner.nextInt();  // Read the number of child meals
        
        // Calculate the total money collected for adult meals, child meals, and all meals
        double totalAdultMeals = adultMeals * ADULT_MEAL_PRICE;
        double totalChildMeals = childMeals * CHILD_MEAL_PRICE;
        double totalAllMeals = totalAdultMeals + totalChildMeals;
        
        // Display the results
        System.out.printf("\nTotal money collected for adult meals: $%.2f\n", totalAdultMeals);
        System.out.printf("Total money collected for child meals: $%.2f\n", totalChildMeals);
        System.out.printf("Total money collected for all meals: $%.2f\n", totalAllMeals);
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}
