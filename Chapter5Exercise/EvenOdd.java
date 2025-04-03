import java.util.Scanner;

public class EvenOdd {
    
    // Method to determine if the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0; // Returns true if even, false if odd
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        // Call the isEven method to determine if the number is even
        boolean isEven = isEven(userInput);

        // Display the result
        if (isEven) {
            System.out.println(userInput + " is even.");
        } else {
            System.out.println(userInput + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}
