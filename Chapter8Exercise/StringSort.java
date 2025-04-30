import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] strings = new String[15];
      int count = 0;

      System.out.println("Enter up to 15 strings. Enter a blank line to stop:");

      // Accept strings from the user
      while (count < 15) {
         System.out.print("Enter string " + (count + 1) + ": ");
         String str = input.nextLine();

         if (str.isEmpty()) {
            break; // Stop input if the user enters a blank line
         }

         strings[count] = str;
         count++;
      }

      // Resize the array to only include the entered strings
      strings = Arrays.copyOfRange(strings, 0, count);

      // Sort the strings in ascending order
      Arrays.sort(strings);

      // Display the sorted strings
      System.out.println("\nStrings in ascending order:");
      for (String str : strings) {
         System.out.println(str);
      }
   }
}
