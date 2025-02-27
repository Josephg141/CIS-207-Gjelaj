import java.util.Scanner;

public class JobPricing {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for job name, cost of materials, hours of work, and hours of travel
        String jobName;
        double costOfMaterials;
        int hoursOfWork, hoursOfTravel;

        // Prompt the user for the job name
        System.out.print("Enter the name of the job: ");
        jobName = scanner.nextLine();

        // Prompt the user for the cost of materials
        System.out.print("Enter the cost of materials: ");
        costOfMaterials = scanner.nextDouble();

        // Prompt the user for the number of hours of work required
        System.out.print("Enter the number of hours of work required: ");
        hoursOfWork = scanner.nextInt();

        // Prompt the user for the number of hours of travel time
        System.out.print("Enter the number of hours of travel time: ");
        hoursOfTravel = scanner.nextInt();

        // Call the method to calculate the job estimate and store the result
        double jobEstimate = calculateJobEstimate(costOfMaterials, hoursOfWork, hoursOfTravel);

        // Display the job name and estimated price
        System.out.printf("The estimated price for the job '%s' is: $%.2f%n", jobName, jobEstimate);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the job estimate
    public static double calculateJobEstimate(double costOfMaterials, int hoursOfWork, int hoursOfTravel) {
        // Define the rates
        double hourlyWorkRate = 35; // $35 per hour for work
        double hourlyTravelRate = 12; // $12 per hour for travel time

        // Calculate the job estimate
        double totalJobCost = costOfMaterials + (hoursOfWork * hourlyWorkRate) + (hoursOfTravel * hourlyTravelRate);

        return totalJobCost;
    }
}
