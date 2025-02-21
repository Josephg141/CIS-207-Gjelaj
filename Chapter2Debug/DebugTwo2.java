import java.util.Scanner;

public class DebugTwo2 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int a, b;

            System.out.print("Enter an integer >> ");
            a = input.nextInt();

            System.out.print("Enter another integer >> ");
            b = input.nextInt();

            System.out.println("The sum is " + (a + b));
            System.out.println("The difference is " + (a - b));
            System.out.println("The product is " + (a * b));
        } 
    }
}