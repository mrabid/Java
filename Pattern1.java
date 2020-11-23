package BeginnerJava;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter any number: ");
        n = input.nextInt();

        for (int r=1; r<=n; r++){
            for (int c=1; c<=r; c++){
                System.out.print(" "+c);
            }
            System.out.println();
        }
    }
}
