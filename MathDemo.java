package BeginnerJava;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 4, y = 2;
        int max = Math.max(x, y);
        System.out.println("Maximum result is: "+max);

        int min = Math.min(x, y);
        System.out.println("Minimum result is: "+min);

        int absolute = Math.abs(y);
        System.out.println("Absolute value of Y: "+absolute);

        double power = Math.pow(x, y);
        System.out.println("X to the power Y: "+power);

        int round = Math.round(8.4f);
        System.out.println("Round of 8.4: "+round);

        double pi = Math.PI;
        System.out.println("Value of pi: "+pi);
    }
}
