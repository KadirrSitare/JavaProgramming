package day15_ForLoop;

import java.util.Scanner;

public class Day15Task7_ReverseAString {

    public static void main(String[] args) {

        System.out.println("Emter a string:");
        String str = new Scanner(System.in).nextLine();
        int length = str.length();
        String reverse = "";

        for (int i = length - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }
}
/*
Write a program that can reverse any given string

			Ex:
				input: 
					Wooden Spoon

				output:
					noopS nedooW
 */