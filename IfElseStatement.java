package BeginnerJava;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
            System.out.print("Enter any number: ");
            a = input.nextInt();

            if (a > 0)
            {
                System.out.print("The number is positive.");
            }
            else if (a < 0)
            {
                System.out.println("The number is negative");
            }
            else
                System.out.println("The number is Zero");
    }
}
