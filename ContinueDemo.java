package BeginnerJava;

import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enter any digit: ");
        n = input.nextInt();
        for(int i = 1; i<=n; i++){
            if(i==10){
                continue;
            }
            System.out.println(i);
        }
    }
}
