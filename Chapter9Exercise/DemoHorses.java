import java.util.Scanner;

public class DemoHorses {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Creating a Horse object
      System.out.println("Enter details for a Horse:");
      System.out.print("Enter horse name: ");
      String name = input.nextLine();
      System.out.print("Enter horse color: ");
      String color = input.nextLine();
      System.out.print("Enter horse birth year: ");
      int birthYear = input.nextInt();
      
      Horse horse = new Horse(name, color, birthYear);
      
      // Display Horse details
      System.out.println("\nHorse Details:");
      horse.displayHorseInfo();

      // Creating a RaceHorse object
      input.nextLine(); // Consume the remaining newline character
      System.out.println("\nEnter details for a RaceHorse:");
      System.out.print("Enter racehorse name: ");
      name = input.nextLine();
      System.out.print("Enter racehorse color: ");
      color = input.nextLine();
      System.out.print("Enter racehorse birth year: ");
      birthYear = input.nextInt();
      System.out.print("Enter number of races: ");
      int numberOfRaces = input.nextInt();
      
      RaceHorse raceHorse = new RaceHorse(name, color, birthYear, numberOfRaces);
      
      // Display RaceHorse details
      System.out.println("\nRaceHorse Details:");
      raceHorse.displayHorseInfo();
   }
}
