package day13_StringClass;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*char tenthChar = word.charAt(9);
        System.out.println("tenthCar = " + tenthChar);
        */
        String s1 = "Batch 25 is the best batch";
        int totalChars = s1.length(); //total number of characters
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length() -1); //last index number
        System.out.println("lastChar = " + lastChar);

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON"
        System.out.println("str = " + str);


        //Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);




    }
}
