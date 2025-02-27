import java.util.Scanner;

public class YummyEventPriceWithMethods {
    public static void main(String[] args) {
        // First executable statement: Call method to get the number of guests
        int numberOfGuests = getNumberOfGuests();

        // Second executable statement: Call method to display the company motto with a border
        displayCompanyMotto();

        // Last executable statement: Call method to compute the price and display event details
        computeAndDisplayEventPrice(numberOfGuests);
    }

    // Method to prompt the user for the number of guests and return the value
    public static int getNumberOfGuests() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        return input.nextInt();  // Return the number of guests entered by the user
    }

    // Method to display the company motto with a border
    public static void displayCompanyMotto() {
        String motto = "Yummy Catering - Your Event, Our Passion!";
        String border = "*".repeat(motto.length() + 4);  // Create a border based on the length of the motto

        System.out.println(border);
        System.out.println("* " + motto + " *");
        System.out.println(border);
    }

    // Method to compute the price based on the number of guests and display event details
    public static void computeAndDisplayEventPrice(int guests) {
        double pricePerGuest = 25.0;  // Example price per guest
        double totalPrice = pricePerGuest * guests;  // Calculate total price

        System.out.println("The total price for your event is: $" + totalPrice);

        // Display whether the event is large or not
        if (guests > 50) {
            System.out.println("This is a large event.");
        } else {
            System.out.println("This is a small event.");
        }
    }
}
