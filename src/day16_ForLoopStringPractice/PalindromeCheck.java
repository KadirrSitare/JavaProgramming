package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();

        int length = str.length();
        String reverse = "";

        for (int i = length - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
