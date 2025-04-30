public class RaceHorse extends Horse {
    // Additional field for RaceHorse
    private int numberOfRaces;
 
    // Constructor
    public RaceHorse(String name, String color, int birthYear, int numberOfRaces) {
       super(name, color, birthYear); // Call parent class constructor
       this.numberOfRaces = numberOfRaces;
    }
 
    // Getter and setter methods for numberOfRaces
    public int getNumberOfRaces() {
       return numberOfRaces;
    }
 
    public void setNumberOfRaces(int numberOfRaces) {
       this.numberOfRaces = numberOfRaces;
    }
 
    // Override displayHorseInfo to include race details
    @Override
    public void displayHorseInfo() {
       super.displayHorseInfo(); // Call the parent class method
       System.out.println("Number of Races: " + numberOfRaces);
    }
 }
 