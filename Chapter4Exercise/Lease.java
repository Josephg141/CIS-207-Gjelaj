public class Lease {
    // Fields to hold tenant's information
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTermInMonths;

    // Default constructor
    public Lease() {
        this.tenantName = "XXX"; // Default name
        this.apartmentNumber = 0; // Default apartment number
        this.monthlyRent = 1000; // Default rent
        this.leaseTermInMonths = 12; // Default term
    }

    // Getters and Setters for each field

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getLeaseTermInMonths() {
        return leaseTermInMonths;
    }

    public void setLeaseTermInMonths(int leaseTermInMonths) {
        this.leaseTermInMonths = leaseTermInMonths;
    }

    // Nonstatic method to add pet fee
    public void addPetFee() {
        this.monthlyRent += 10; // Adds $10 to the rent
        explainPetPolicy(); // Calls the static method to explain the policy
    }

    // Static method to explain pet policy
    public static void explainPetPolicy() {
        System.out.println("Pet Fee Policy: A $10 monthly fee will be added to the rent if pets are allowed.");
    }

    // Method to display lease details
    public void displayLeaseDetails() {
        System.out.println("Tenant Name: " + tenantName);
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Monthly Rent: $" + monthlyRent);
        System.out.println("Lease Term: " + leaseTermInMonths + " months");
    }
}
