package BeginnerJava;


import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int[] number = new int[5];
//        for(int i=0; i<5; i++) {
//            number[i] = input.nextInt();
//        }

        String[] name = {"Abid", "Abir", "Joy", "Koushik", "Mr. Japan"};

        for(String x : name)
        {
            System.out.print(x +", ");
        }
        System.out.println("\nName Array Size: "+name.length);
    }
}
