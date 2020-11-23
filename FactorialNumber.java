package BeginnerJava;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fac=1;
        System.out.print("Give me a factorial digit: ");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            fac= fac*i;
        }
        System.out.println("Factorial of "+n +" = " +fac);
    }
}
