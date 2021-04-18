package BeginnerJava;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] num = {2, 5, 4, 9, 3 ,1, 45, 263,7};
        Arrays.sort(num);
        int s = num.length;

        // Ascending order
        System.out.print("Ascending order: ");
        for(int i=0; i<s; i++)
        {
            System.out.print(num[i] +" ");
        }
        System.out.println();

        // Descending order
        System.out.print("Descending order: ");
        for(int i=s-1; i>=0; i--) {
            System.out.print(num[i] +" ");
        }

        System.out.println();
        String[] name = {"Sujon", "Likhon", "Koushik", "Abid"};
        Arrays.sort(name);
        int siz = name.length;

        // Ascending order
        System.out.print("Ascending order: ");
        for(int i=0; i<siz; i++){
            System.out.print(name[i] +" ");
        }
        System.out.println();

        // Descending order
        System.out.print("Descending order: ");
        for(int i=siz-1; i>=0; i--) {
            System.out.print(name[i] +" ");
        }
    }
}
