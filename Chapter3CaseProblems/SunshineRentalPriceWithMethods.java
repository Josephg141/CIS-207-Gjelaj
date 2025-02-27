import java.util.Scanner;

public class SunshineRentalPriceWithMethods {
    public static void main(String[] args) {
        // First executable statement: Call method to get the rental time in minutes
        int rentalTimeInMinutes = getRentalTimeInMinutes();

        // Second executable statement: Call method to display the company motto with a border
        displayCompanyMotto();

        // Last executable statement: Call method to compute and display the rental price details
        computeAndDisplayRentalPrice(rentalTimeInMinutes);
    }

    // Method to prompt the user for the rental time in minutes and return the value
    public static int getRentalTimeInMinutes() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rental time in minutes: ");
        return input.nextInt();  // Return the rental time entered by the user
    }

    // Method to display the company motto with a border
    public static void displayCompanyMotto() {
        String motto = "Sunshine Seashore Supplies - Your Beach Adventure Awaits!";
        String border = "*".repeat(motto.length() + 4);  // Create a border based on the length of the motto

        System.out.println(border);
        System.out.println("* " + motto + " *");
        System.out.println(border);
    }

    // Method to compute the rental price based on the rental time and display the details
    public static void computeAndDisplayRentalPrice(int rentalTimeInMinutes) {
        int hours = rentalTimeInMinutes / 60;  // Calculate hours
        int extraMinutes = rentalTimeInMinutes % 60;  // Calculate remaining minutes
        double pricePerHour = 10.0;  // Example price per hour
        double totalPrice = hours * pricePerHour + (extraMinutes > 0 ? pricePerHour : 0);  // Calculate total price

        System.out.println("Rental time: " + hours + " hours and " + extraMinutes + " minutes");
        System.out.println("The total rental price is: $" + totalPrice);

        // You could add more rental details here, such as extra charges for additional minutes.
    }
}
