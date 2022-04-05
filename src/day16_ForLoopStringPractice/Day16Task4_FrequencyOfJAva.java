package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Day16Task4_FrequencyOfJAva {

    public static void main(String[] args) {

        System.out.println("Enter a sentence:");
        String str = new Scanner(System.in).nextLine();

        String java = "Java";
        int frequency = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 4).equalsIgnoreCase(java)) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
/*
write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2
 */