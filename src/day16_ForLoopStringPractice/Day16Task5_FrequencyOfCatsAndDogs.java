package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Day16Task5_FrequencyOfCatsAndDogs {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();

        str = str.toLowerCase();
        int freqOfDogs = 0;
        int freqOfCats = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
                freqOfDogs++;
            }
            if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
                freqOfCats++;
            }
        }
        boolean isEqual = freqOfCats == freqOfDogs;
        System.out.println(isEqual);
    }
}
/*
write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */