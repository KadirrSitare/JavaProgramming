package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfAWordInAString {

    public static void main(String[] args) {

        System.out.println("Enter a sentence:");
        String str = new Scanner(System.in).nextLine();

        String java = "Java";
        int frequency = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.substring(i, i + 4).equalsIgnoreCase(java)) {
                frequency ++;
            }
        }
        System.out.println(frequency);
    }
}
/*
 write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */