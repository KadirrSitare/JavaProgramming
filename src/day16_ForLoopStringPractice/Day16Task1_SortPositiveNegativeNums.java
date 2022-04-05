package day16_ForLoopStringPractice;

import java.io.PrintStream;
import java.util.Scanner;

public class Day16Task1_SortPositiveNegativeNums {

    public static void main(String[] args) {

        int num = 0;
        int positive = 0;
        int negative = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers one by one: ");
        for (int i = 1; i < 6; i++) {
            num = scan.nextInt();
            if (num > 0) {
                positive += 1;
            } else if (num < 0) {
                negative += 1;
            }
        }
        System.out.println(positive + " positive and " + negative + " negative");
        scan.close();
    }
}
/*
 Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */