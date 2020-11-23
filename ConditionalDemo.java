package BeginnerJava;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r, x, y;
        System.out.print("Enter any digit: ");
        x = input.nextInt();
        System.out.print("Enter any digit: ");
        y = input.nextInt();
        r = (x>y) ? x : y;

        System.out.println(r);

    }
}
