package BeginnerJava;

import java.util.Scanner;

public class LoopDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(int i=1; i<=10; i++){
            if(i<10){

                System.out.print(String.valueOf(i)+" + ");
            }
            else {
                System.out.print(String.valueOf(i)+" = ");
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
