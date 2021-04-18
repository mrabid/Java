package BeginnerJava;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("2D araay input of A: ");
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("2D araay input of A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("2D array of A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] +" ");
            }
            System.out.println();
        }

        System.out.print("2D array of B: ");
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] +" ");
            }
            System.out.println();
        }
//  Adding A and B Matrix
        System.out.println("Addition of A & B Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
