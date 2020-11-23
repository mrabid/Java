package BeginnerJava;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, count=0, totalprime=0;
        System.out.print("Enter initial number: ");
        n= input.nextInt();
        System.out.print("Enter final number: ");
        m= input.nextInt();

        for(int i=n; i<=m; i++){
            for(int j=2; j<=i-1; j++){
                if(i %  j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
                totalprime++;
            }
            count=0;
        }
        System.out.println("Total prime number is: "+totalprime);
    }
}
