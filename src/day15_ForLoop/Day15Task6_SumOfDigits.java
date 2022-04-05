package day15_ForLoop;

import java.util.Scanner;

public class Day15Task6_SumOfDigits {

    public static void main(String[] args) {

        System.out.println("Emter a string:");
        String str = new Scanner(System.in).nextLine();
        int length = str.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i)>= '1' && str.charAt(i)<='9'){
                sum += str.charAt(i) - 48;
            }
        }
        System.out.println("sum = " + sum);
    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */