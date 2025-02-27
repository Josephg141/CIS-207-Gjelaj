import java.util.Scanner;

public class DebugThree1 {
    public static void main(String args[]) {
        // Declare variables to store the check amounts
        double check1;
        double check2;
        
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the first check amount
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  // Use nextDouble() instead of nextInt()
        
        // Prompt the user for the second check amount
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  // Use nextDouble() instead of nextInt()
        
        // Calculate and display the tip for both checks
        calcTip(check1);  // Pass check1 to calcTip()
        calcTip(check2);  // Pass check2 to calcTip()
    }

    // Method to calculate and display the tip
    public static void calcTip(double bill) {
        final double RATE = 0.15;  // Define the tip rate as 15%
        double tip = bill * RATE;  // Calculate the tip
        System.out.println("The tip should be at least $" + tip);  // Display the tip
    }
}
