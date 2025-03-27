public class Sandwich {
    private String breadType;
    private String fillingType;
    private boolean hasLettuce;
    private boolean hasTomato;

    // Constructor
    public Sandwich(String breadType, String fillingType, boolean hasLettuce, boolean hasTomato) {
        this.breadType = breadType;
        this.fillingType = fillingType;
        this.hasLettuce = hasLettuce;
        this.hasTomato = hasTomato;
    }

    // Getter methods
    public String getBreadType() {
        return breadType;
    }

    public String getFillingType() {
        return fillingType;
    }

    public boolean hasLettuce() {
        return hasLettuce;
    }

    public boolean hasTomato() {
        return hasTomato;
    }

    // Display sandwich details
    public void displaySandwichDetails() {
        System.out.println("Sandwich Details:");
        System.out.println("Bread Type: " + breadType);
        System.out.println("Filling Type: " + fillingType);
        System.out.println("Lettuce: " + (hasLettuce ? "Yes" : "No"));
        System.out.println("Tomato: " + (hasTomato ? "Yes" : "No"));
    }
}