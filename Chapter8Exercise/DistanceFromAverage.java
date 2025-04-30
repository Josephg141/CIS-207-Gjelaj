import java.util.Scanner;

public class DistanceFromAverage {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double[] numbers = new double[15];
      int count = 0;
      double sum = 0;
      double number;

      System.out.println("Enter up to 15 double values. Enter 99999 to quit.");

      // Collecting numbers from the user
      while(count < 15) {
         System.out.print("Enter a number: ");
         number = input.nextDouble();

         if(number == 99999) {
            break;  // Quit the loop if user enters 99999
         }

         numbers[count] = number;
         sum += number;
         count++;
      }

      if(count == 0) {
         System.out.println("Error: No numbers were entered.");
      } else {
         double average = sum / count;

         System.out.println("\nNumber of values entered: " + count);
         System.out.println("Arithmetic average: " + average);

         for(int i = 0; i < count; i++) {
            double distance = Math.abs(numbers[i] - average);
            System.out.println("Value: " + numbers[i] + ", Distance from average: " + distance);
         }
      }
   }
}
