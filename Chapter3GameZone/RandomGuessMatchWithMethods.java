import java.util.Scanner;

public class RandomGuessMatchWithMethods {
    public static void main(String[] args) {
        // Declare the final constants for MIN and MAX
        final int MIN = 1;
        final int MAX = 100;

        // Generate a random number between MIN and MAX
        int random = MIN + (int)(Math.random() * (MAX - MIN + 1));

        // Call the method to get the user's guess
        int userGuess = getUserGuess(MIN, MAX);

        // Check if the user's guess is correct
        boolean isCorrect = (userGuess == random);

        // Call the method to display the result
        displayGuessResult(random, userGuess, isCorrect);
    }

    // Method to prompt the user for their guess and return it
    public static int getUserGuess(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between " + min + " and " + max + ": ");
        return input.nextInt();  // Return the user's guess
    }

    // Method to display the result of the guess
    public static void displayGuessResult(int random, int userGuess, boolean isCorrect) {
        System.out.println("The random number was: " + random);
        System.out.println("Your guess was: " + userGuess);

        // Display whether the user's guess was correct
        if (isCorrect) {
            System.out.println("Congratulations! Your guess was correct.");
        } else {
            System.out.println("Oops! Your guess was incorrect.");
            System.out.println("You were " + Math.abs(random - userGuess) + " away from the correct number.");
        }
    }
}
