package BeginnerJava;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("Enter any number: ");
        a = input.nextInt();
        if(a != 0) {
            if (a % 2 == 0) {
                System.out.println("The number is Even.");
            } else if (a % 2 != 0) {
                System.out.println("The number is Odd.");
            }
        }
        else{
            System.out.println("The number is Zero.");
        }
    }
}
