package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Day16Task3_MultiplyWithoutMultiplicationSign {

    public static void main(String[] args) {

        System.out.println("Enter two positive numbers:");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        int num3 = num2;

        if (num1 < 0 || num2 < 0) {
            System.out.println("Invalid");
        } else if ((num1 == 0) || (num2 == 0)) {
            System.out.println(0);
        } else {
            for (int i = 2; i <= num1; i++) {
                num2 += num3;
            }
            System.out.println(num2);
        }
    }
}
/*Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */