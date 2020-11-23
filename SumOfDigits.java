package BeginnerJava;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, temp, sum=0;
        System.out.print("Enter any digits: ");
        n = input.nextInt();

        temp = n;
        while (temp != 0){
            r = temp % 10;
            sum = r + sum;
            temp = temp / 10;

        }
        System.out.println(sum);

    }
}
