package BeginnerJava;

import java.util.Scanner;

public class DigitSpelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit;
            System.out.print("Enter any digit 0 to 9: ");
            digit = input.nextInt();
            switch (digit){
                case 0:
                    System.out.println("The value is Zero");
                    break;
                case 1:
                    System.out.println("The value is One");
                    break;
                case 2:
                    System.out.println("The value is Two");
                    break;
                case 3:
                    System.out.println("The value is Three");
                    break;
                case 4:
                    System.out.println("The value is Four");
                    break;
                case 5:
                    System.out.println("The value is Five");
                    break;
                case 6:
                    System.out.println("The value is Six");
                    break;
                case 7:
                    System.out.println("The value is Seven");
                    break;
                case 8:
                    System.out.println("The value is Eight");
                    break;
                case 9:
                    System.out.println("The value is Nine");
                    break;
                default:
                    System.out.println("This isn't a digit.");
            }
    }
}
