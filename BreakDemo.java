package BeginnerJava;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter digit: ");
        n = input.nextInt();

        for(int i=0; i<n; i++){
            if(i==10){
                break;
            }
            System.out.println(i);
        }

    }
}
