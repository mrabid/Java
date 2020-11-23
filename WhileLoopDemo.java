package BeginnerJava;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, r, c;

        c=1;

        while(c<2) {
            System.out.print("Enter any 2 digit: ");
            a = input.nextInt();
            b = input.nextInt();
            r = a + b;
            System.out.println("Result: " + r);
        }
    }
}
