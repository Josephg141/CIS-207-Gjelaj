import java.util.Scanner;

public class ArrayMethodDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] numbers = new int[10];

      // Prompt user to enter 10 integers
      System.out.println("Please enter 10 integers:");
      for (int i = 0; i < 10; i++) {
         System.out.print("Enter integer " + (i + 1) + ": ");
         numbers[i] = input.nextInt();
      }

      // Call the methods
      displayAll(numbers);
      displayReverse(numbers);
      displaySum(numbers);
      displayLessThan12(numbers);
      displayGreaterThanAverage(numbers);
   }

   // Method to display all integers
   public static void displayAll(int[] numbers) {
      System.out.println("\nAll integers:");
      for (int num : numbers) {
         System.out.print(num + " ");
      }
      System.out.println();
   }

   // Method to display all integers in reverse order
   public static void displayReverse(int[] numbers) {
      System.out.println("\nIntegers in reverse order:");
      for (int i = numbers.length - 1; i >= 0; i--) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
   }

   // Method to display the sum of the integers
   public static void displaySum(int[] numbers) {
      int sum = 0;
      for (int num : numbers) {
         sum += num;
      }
      System.out.println("\nSum of the integers: " + sum);
   }

   // Method to display values less than 12 or a message if none are found
   public static void displayLessThan12(int[] numbers) {
      boolean found = false;
      System.out.println("\nValues less than 12:");
      for (int num : numbers) {
         if (num < 12) {
            System.out.print(num + " ");
            found = true;
         }
      }
      if (!found) {
         System.out.println("No values less than 12.");
      }
      System.out.println();
   }

   // Method to display values greater than the average
   public static void displayGreaterThanAverage(int[] numbers) {
      int sum = 0;
      for (int num : numbers) {
         sum += num;
      }
      double average = sum / (double) numbers.length;

      System.out.println("\nValues greater than the average (" + average + "):");
      boolean found = false;
      for (int num : numbers) {
         if (num > average) {
            System.out.print(num + " ");
            found = true;
         }
      }
      if (!found) {
         System.out.println("No values greater than the average.");
      }
      System.out.println();
   }
}
