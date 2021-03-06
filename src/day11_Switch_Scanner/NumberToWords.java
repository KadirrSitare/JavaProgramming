package day11_Switch_Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        int number = -7;

        String word = (number >= 0 && number <= 9) ?
                        (number == 1) ? "One" : (number == 2) ? "two" : (number == 3) ? "three" : (number == 4) ? "four"
                        : (number == 5) ? "five" : (number == 6) ? "six" : (number == 7) ? "seven" : (number == 8) ? "eight"
                        : (number == 9) ? "nine" : "zero"
                : "Invalid number";

        System.out.println(word);
    }
}
/*
Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */