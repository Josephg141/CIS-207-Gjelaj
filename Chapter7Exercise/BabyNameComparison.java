import java.util.Scanner;

public class BabyNameComparison {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String name1, name2, name3;

      System.out.print("Enter the first name >> ");
      name1 = input.nextLine();
      System.out.print("Enter the second name >> ");
      name2 = input.nextLine();
      System.out.print("Enter the third name >> ");
      name3 = input.nextLine();

      System.out.println("\nHere are some baby name combinations:");
      System.out.println(name1 + name2);
      System.out.println(name1 + name3);
      System.out.println(name2 + name1);
      System.out.println(name2 + name3);
      System.out.println(name3 + name1);
      System.out.println(name3 + name2);
   }
}


