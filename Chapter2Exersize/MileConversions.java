public class MileConversions {
    public static void main(String[] args) {
        // Constants for number of inches, feet, and yards in a mile
        final int INCHES_IN_MILE = 63360;  // 5280 feet * 12 inches
        final int FEET_IN_MILE = 5280;    // 1 mile = 5280 feet
        final int YARDS_IN_MILE = 1760;   // 1 mile = 1760 yards
        
        // Variable to represent a number of miles
        double miles = 5;  // Example: 5 miles
        
        // Compute the equivalent values
        double inches = miles * INCHES_IN_MILE;
        double feet = miles * FEET_IN_MILE;
        double yards = miles * YARDS_IN_MILE;
        
        // Display the results with explanatory text
        System.out.println("For " + miles + " miles:");
        System.out.println("Inches: " + inches + " inches");
        System.out.println("Feet: " + feet + " feet");
        System.out.println("Yards: " + yards + " yards");
    }
}

