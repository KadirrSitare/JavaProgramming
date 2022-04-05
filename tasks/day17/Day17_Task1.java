package day17;

import java.util.Scanner;

public class Day17_Task1 {

    public static void main(String[] args) {

        System.out.println("Enter a positive number:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Enter another positive number:");
        int num2 = new Scanner(System.in).nextInt();

        int num3 = num1;
        int result = 0;
        int remainder = 0;

        while (num1 > 0) {
            remainder = num1;
            num1 = num1 - num2;
            if (num1 < 0) {
                break;
            }
            result += 1;
        }
        System.out.println(num3 + " / " + num2 + " = " + result + " and remainder is " + remainder);
    }
}
/*
Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */