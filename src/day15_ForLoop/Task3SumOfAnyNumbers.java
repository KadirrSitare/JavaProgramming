package day15_ForLoop;

import java.util.Scanner;

public class Task3SumOfAnyNumbers {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int num = new Scanner(System.in).nextInt();
        int sum = 0;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
        } else if (num < 0) {
            for (int i = 1; i >= num; i--) {
                sum += i;
            }
        } else {
            sum = 1;
        }
        System.out.println(sum);
    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */
