public class QuartsToGallons {
    public static void main(String[] args) {
        // Declare a constant for the number of quarts in a gallon
        final int QUARTS_IN_GALLON = 4;
        
        // Declare a variable to represent the number of quarts needed for the job
        int quartsNeeded = 18;

        // Calculate the number of gallons and remaining quarts
        int gallons = quartsNeeded / QUARTS_IN_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON;

        // Display the result with explanatory text
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}
