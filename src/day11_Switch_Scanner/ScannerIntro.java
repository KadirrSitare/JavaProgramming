package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer and a decimal:");

        int num1 = input.nextInt();
        double num2 = input.nextDouble();

        System.out.println("Multiplication:" + (num1 * num2));

        input.close(); //closes the scanner (after this you cannot use the scanner anymore)

    }
}
