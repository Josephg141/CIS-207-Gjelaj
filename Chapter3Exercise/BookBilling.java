import java.util.Scanner;

public class BookBilling {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for quantity of books and coupon value
        int quantity;
        double couponValue;

        // Prompt the user for the quantity of books ordered
        System.out.print("Enter the quantity of books ordered: ");
        quantity = scanner.nextInt();

        // Prompt the user for the coupon value
        System.out.print("Enter the coupon value (or 0 if none): ");
        couponValue = scanner.nextDouble();

        // Test the first overloaded method (no parameters)
        double totalPriceNoParams = computeBill();
        System.out.printf("Total price for one book with no quantity specified: $%.2f%n", totalPriceNoParams);

        // Test the second overloaded method (with one parameter - quantity)
        double totalPriceWithQuantity = computeBill(quantity);
        System.out.printf("Total price for %d books without a coupon: $%.2f%n", quantity, totalPriceWithQuantity);

        // Test the third overloaded method (with two parameters - quantity and coupon value)
        double totalPriceWithCoupon = computeBill(quantity, couponValue);
        System.out.printf("Total price for %d books with a coupon of $%.2f: $%.2f%n", quantity, couponValue, totalPriceWithCoupon);

        // Close the scanner
        scanner.close();
    }

    // Overloaded method 1: Computes the price for one book, including tax
    public static double computeBill() {
        double pricePerBook = 14.99;
        double taxRate = 0.08; // 8% tax
        double totalPrice = pricePerBook * (1 + taxRate); // Add tax to the price of one book
        return totalPrice;
    }

    // Overloaded method 2: Computes the price based on quantity, including tax
    public static double computeBill(int quantity) {
        double pricePerBook = 14.99;
        double taxRate = 0.08; // 8% tax
        double totalPrice = pricePerBook * quantity * (1 + taxRate); // Add tax to the total price
        return totalPrice;
    }

    // Overloaded method 3: Computes the price based on quantity and coupon, including tax
    public static double computeBill(int quantity, double couponValue) {
        double pricePerBook = 14.99;
        double taxRate = 0.08; // 8% tax
        double totalPrice = pricePerBook * quantity - couponValue; // Subtract coupon value from total price
        totalPrice = totalPrice * (1 + taxRate); // Add tax to the discounted total price
        return totalPrice;
    }
}
