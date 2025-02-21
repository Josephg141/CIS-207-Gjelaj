import java.util.Scanner;

public class DebugTwo4 {
    public static void main(String[] args) {
        double cost;
        final double TAX = 0.06;

        // Using try-with-resources to close the scanner automatically
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter cost of purchase >> ");
            cost = input.nextDouble();  // Corrected: use nextDouble() to read a double
            
            System.out.println("Cost is $" + cost);  // Corrected: added quotation marks and proper concatenation
            System.out.println("With " + (TAX * 100) + "% tax,");  // Corrected: fixed tax percentage calculation
            System.out.println("   the total is $" + (cost + cost * TAX));  // Corrected: fixed typo
        } // Scanner is automatically closed at the end of the try block
    }
}
