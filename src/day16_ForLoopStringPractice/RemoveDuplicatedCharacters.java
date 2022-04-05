package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDuplicatedCharacters {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();

        String removed = "";
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (!removed.contains("" + str.charAt(i))) {
                removed += str.charAt(i);
            }
        }
        System.out.println(removed);
    }
}
/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */
