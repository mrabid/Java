package BeginnerJava;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, mul=0;
        System.out.print("Enter the multiplication number: ");
        n= input.nextInt();

        System.out.println("The number of " +n +" multiplication is: ");
        for(int i=1; i<=10; i++){
            mul= i*n;
            System.out.println(+n +" X " +i +" = " +mul);
        }
    }
}
