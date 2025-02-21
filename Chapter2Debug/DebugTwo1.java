import java.util.Scanner;
public class DebugTwo1
{
   public static void main(String[] args){

   
   try (Scanner input = new Scanner(System.in))
   {
      int oneInt;
      double oneDouble;
      String oneString;
      System.out.print("Enter an integer >> ");
      oneInt = input.nextInt();
      System.out.print("Enter a double >> ");
      oneDouble = input.nextDouble();
      input.nextLine();
      System.out.print("Enter a string >> ");
      oneString = input.nextLine();
      System.out.print("The int is ");
      System.out.println(oneInt);
      System.out.print("The double is ");
      System.out.println(oneDouble);
      System.out.print("The String is ");
      System.out.println(oneString);

   }
}
}