import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        // Declare four Lease objects
        Lease lease1, lease2, lease3, lease4;

        // Initialize the first three Lease objects using getData() method
        lease1 = getData();
        lease2 = getData();
        lease3 = getData();

        // Initialize the fourth Lease object using the default constructor
        lease4 = new Lease();

        // Pass the lease1 object to showValues() to display its initial values
        showValues(lease1);

        // Add the pet fee to lease1 and confirm the pet fee explanation is displayed
        lease1.addPetFee();

        // Call showValues() again for lease1 to confirm the updated rent after pet fee
        showValues(lease1);

        // Call showValues() for each of the other Lease objects
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }

    // Method to prompt user for data and return a newly constructed Lease object
    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Lease details
        System.out.print("Enter tenant's name: ");
        String tenantName = scanner.nextLine();

        System.out.print("Enter apartment number: ");
        int apartmentNumber = scanner.nextInt();

        System.out.print("Enter monthly rent: ");
        double monthlyRent = scanner.nextDouble();

        System.out.print("Enter lease term in months: ");
        int leaseTermInMonths = scanner.nextInt();
        scanner.nextLine(); // To consume the newline character

        // Create a new Lease object using the values provided by the user
        Lease lease = new Lease();
        lease.setTenantName(tenantName);
        lease.setApartmentNumber(apartmentNumber);
        lease.setMonthlyRent(monthlyRent);
        lease.setLeaseTermInMonths(leaseTermInMonths);

        return lease;
    }

    // Method to display the values of a Lease object
    public static void showValues(Lease lease) {
        System.out.println("\nLease Details:");
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease.getMonthlyRent());
        System.out.println("Lease Term: " + lease.getLeaseTermInMonths() + " months");
    }
}
