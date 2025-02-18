import java.util.Scanner;  // Import Scanner class for user input

public class ChiliToGoProfit {
    public static void main(String[] args) {
        // Constants for the prices of meals and the cost to produce each type
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;
        final double ADULT_MEAL_COST = 4.35;
        final double CHILD_MEAL_COST = 3.10;
        
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
        
        // Calculate the profit for adult meals, child meals, and total profit
        double profitAdultMeals = (ADULT_MEAL_PRICE - ADULT_MEAL_COST) * adultMeals;
        double profitChildMeals = (CHILD_MEAL_PRICE - CHILD_MEAL_COST) * childMeals;
        double totalProfit = profitAdultMeals + profitChildMeals;
        
        // Display the results
        System.out.printf("\nTotal money collected for adult meals: $%.2f\n", totalAdultMeals);
        System.out.printf("Total money collected for child meals: $%.2f\n", totalChildMeals);
        System.out.printf("Total money collected for all meals: $%.2f\n", totalAllMeals);
        
        System.out.printf("\nProfit for adult meals: $%.2f\n", profitAdultMeals);
        System.out.printf("Profit for child meals: $%.2f\n", profitChildMeals);
        System.out.printf("Total profit from all meals: $%.2f\n", totalProfit);
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}
