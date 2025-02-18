public class InchesToFeet {
    public static void main(String[] args) {
        // Constant for the number of inches in one foot
        final int INCHES_IN_FOOT = 12;
        
        // Variable to hold the length in inches
        int inches = 86;  // Example: 86 inches
        
        // Compute the number of feet and remaining inches
        int feet = inches / INCHES_IN_FOOT;        // Integer division to get the number of feet
        int remainingInches = inches % INCHES_IN_FOOT; // Modulus to get the remaining inches
        
        // Display the result
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
    }
}
