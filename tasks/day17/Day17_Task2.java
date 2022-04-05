package day17;

import java.util.Scanner;

public class Day17_Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter another number:");
        int num2 = scan.nextInt();

        while (num1 >= 0 && num2 >= 0) {
            sum = num1 + num2;
            System.out.println(sum);
            System.out.println("Enter a number:");
            num1 = scan.nextInt();
            System.out.println("Enter another number:");
            num2 = scan.nextInt();
        }
        System.out.println("Invalid number");

    }
}
/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */