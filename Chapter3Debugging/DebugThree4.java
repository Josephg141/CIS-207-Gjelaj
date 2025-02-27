import java.util.Scanner;

public class DebugThree4 {
    public static void main(String args[]) {
        // Declare variables for the credits of the two students
        int credits1;
        int credits2;

        // The rate per credit hour
        final double RATE = 75.84;

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the credits of the first student
        System.out.print("Enter credits for first student >> ");
        credits1 = input.nextInt();  // Corrected typo: "inpput" to "input"

        // Prompt the user for the credits of the second student
        System.out.print("Enter credits for second student >> ");  // Added missing quotation marks
        credits2 = input.nextInt();  // Corrected typo: "inpput" to "input"

        // Compute and display the tuition bill for both students
        computeTuitionBill(credits1, RATE, 1);  // First student
        computeTuitionBill(credits2, RATE, 2);  // Second student
    }

    // Method to calculate and display the tuition bill
    public static void computeTuitionBill(int c, double r, int student) {
        // Calculate the total tuition bill and display the result
        System.out.println("Total due for student #" + student + " is $" + (r * c));  // Removed extra parenthesis
    }
}
