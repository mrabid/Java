package BeginnerJava;

import java.util.Scanner;

public class VowelConsonantDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        System.out.println("Enter any later: ");
        ch = input.next().charAt(0);
        if(ch == 'a') //(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("The later is Vowel.");
        }
        else if(ch == 'e') {
            System.out.println("The later is Vowel.");
        }
        else if(ch == 'i') {
            System.out.println("The later is Vowel.");
        }
        else if(ch == 'o') {
            System.out.println("The later is Vowel.");
        }
        else if(ch == 'u') {
            System.out.println("The later is Vowel.");
        }

        else{
            System.out.println("The later is Consonant.");
        }

    }
}
