package day17;

import java.util.Scanner;

public class Day17_Task4 {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int num = new Scanner(System.in).nextInt();
        int i = 1;
        String divby15 = "";
        String divby5 = "";
        String divby3 = "";
        while (i <= num) {
            if (i % 15 == 0) {
                divby15 += " " + i;
            } else if (i % 5 == 0) {
                divby5 += " " + i;
            } else if (i % 3 == 0) {
                divby3 += " " + i;
            }
            i++;
        }
        System.out.println("Divisible By 15" + divby15);
        System.out.println("Divisible By 5" + divby5);
        System.out.println("Divisible By 3" + divby3);
    }
}
/*
Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5 and 15,
	                then it should only be displayed in DivisibelBy15' section

	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section

	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section

	            EX:
	                input: 100

	                Output:
	                     Divisible By 15 15 30 45 60 75 90
	                     Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	                     Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */