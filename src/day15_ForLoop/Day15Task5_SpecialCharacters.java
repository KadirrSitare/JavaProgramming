package day15_ForLoop;

import java.util.Scanner;

public class Day15Task5_SpecialCharacters {

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();

        int length = str.length();
        String letters = "", digits = "", specialChars = "";

        for (int i = 0; i <= length - 1; i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
                letters += str.charAt(i);
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                digits += str.charAt(i);
            } else {
                if (str.charAt(i) != ' ') {  // if the special character is not a space
                    specialChars += str.charAt(i);
                }
            }
        }
        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("specialChars: " + specialChars);

    }
}
/*
 write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */