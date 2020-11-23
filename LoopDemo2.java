package BeginnerJava;
import java.util.Scanner;
public class LoopDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m , n, sum=0, even=0, odd=0;
        System.out.print("Enter first initial digit: ");
        m = input.nextInt();
        System.out.print("Enter second initial digit: ");
        n = input.nextInt();
        for (int i=m; i<=n; i++){
            if(i<n){
                System.out.print(String.valueOf(i)+" + ");
            }
            else {
                System.out.print(String.valueOf(i)+" = ");
            }
            sum += i;
        }
        System.out.println(sum);

        int y;
        if(n%2 != 0){
            y = n-1;
        }else {
            y=n;
        }
        for (int i=m; i<=n; i++){
            if(i%2==0){
                if(i<y){
                    System.out.print(String.valueOf(i)+" + ");
                }
                else {
                    System.out.print(String.valueOf(i)+" = ");
                }
                even += i;
            }
        }
        System.out.println(even);

        int x;
        if(n%2 == 0){
            x = n-1;
        }else {
            x=n;
        }
        for (int i=m; i<=n; i++){
            if(i%2 !=0){
                if(i<x){
                    System.out.print(String.valueOf(i)+" + ");
                }
                else {
                    System.out.print(String.valueOf(i)+" = ");
                }
                odd += i;
            }
        }
        System.out.println(odd);

    }
}
