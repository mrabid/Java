package BeginnerJava;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, temp, sum=0;
        System.out.print("Enter any digit check for palindrome number: ");
        n = input.nextInt();

        temp = n;
        while (temp != 0){
            r = temp % 10;
            sum = sum * 10 +r;
            temp = temp / 10;
        }
        if(n == sum){
            System.out.println("This number is Palindrome.");
        }
        else {
            System.out.println("This number is't Palindrome.");
        }
    }
}
