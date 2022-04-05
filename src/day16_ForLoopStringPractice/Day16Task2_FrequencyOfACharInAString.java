package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Day16Task2_FrequencyOfACharInAString {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();
        System.out.println("Enter a char:");
        String char1 = new Scanner(System.in).next();

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(char1)) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
/*
Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */