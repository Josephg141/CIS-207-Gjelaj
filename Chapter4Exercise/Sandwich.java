public class Sandwich {
    // Data fields
    private String mainIngredient;
    private String breadType;
    private double price;

    // Constructor
    public Sandwich(String mainIngredient, String breadType, double price) {
        this.mainIngredient = mainIngredient;
        this.breadType = breadType;
        this.price = price;
    }

    // Getters and setters
    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Main method for testing
    public static void main(String[] args) {
        Sandwich mySandwich = new Sandwich("Tuna", "Wheat", 4.99);

        // Displaying values using getters
        System.out.println("Main Ingredient: " + mySandwich.getMainIngredient());
        System.out.println("Bread Type: " + mySandwich.getBreadType());
        System.out.println("Price: $" + mySandwich.getPrice());

        // Changing values using setters
        mySandwich.setMainIngredient("Chicken");
        mySandwich.setBreadType("Rye");
        mySandwich.setPrice(5.49);

        // Displaying updated values
        System.out.println("\nUpdated Sandwich:");
        System.out.println("Main Ingredient: " + mySandwich.getMainIngredient());
        System.out.println("Bread Type: " + mySandwich.getBreadType());
        System.out.println("Price: $" + mySandwich.getPrice());
    }
}
