package BeginnerJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fib=0, first=0, second=1;
        System.out.print("How many numbers you want to see in fibonacci series: ");
        n = input.nextInt();

        System.out.print("The fibonacci series is: "+first +" " +second);
        for (int i=2; i<=n; i++){
            fib= first+second;
            System.out.print(" "+fib);
            first = second;
            second = fib;
        }
    }
}
