package BeginnerJava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, temp, sum=0;
        System.out.print("Enter any digits check for armstrong number: ");
        n = input.nextInt();
        temp = n;
        while (temp != 0){
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        if(n == sum){
            System.out.println("This is Armstrong number.");
        }
        else {
            System.out.println("This isn't Armstrong number.");
        }
    }
}
