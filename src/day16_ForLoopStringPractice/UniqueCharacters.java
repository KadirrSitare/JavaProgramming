package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();

        int length = str.length();
        String unique = "";

        for (int i = 0; i < length; i++) { // i: index numbers of str (starting from 0)
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) { //if the first and last index numbers of the character are same, then the character is unique
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
/*
Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */