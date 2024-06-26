package DataType;

import java.util.Scanner;


public class Arithmetic {
    public static void main(String[] args) {

//        int  a = 20;
//        int b = 10;

//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(a++);
//        System.out.println(b--);

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }

        // Close the scanner
        scanner.close();



    }
}
