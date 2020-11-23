package BeginnerJava;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count=0;
        System.out.print("Enter any number: ");
        n= input.nextInt();

        for(int i=2; i<n; i++){
            if( n%i == 0 ){
               count++;
               break;
            }
        }
        if(count == 0){
            System.out.println("This is prime number.");
        }
        else {
            System.out.println("This is not prime number.");
        }
    }
}
