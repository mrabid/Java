package BeginnerJava;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, mul=0;
        System.out.print("Enter initial number: ");
        n= input.nextInt();
        System.out.print("Enter final number: ");
        m= input.nextInt();

        for(int i=n; i<=m; i++){
            System.out.println("\nThe number of " +i +" multiplication is: ");
            for(int j=1; j<=10; j++){
                mul= i*j;
                System.out.println(+j +" X " +i +" = " +mul);
            }
        }
    }
}
