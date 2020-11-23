package BeginnerJava;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter any number: ");
        n = input.nextInt();
        for (int r=n; r>=1; r--){
            for (int c=1; c<=r; c++){
                System.out.print(" "+c);
            }
            System.out.println();
        }
    }
}
