package day15_ForLoop;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();
        int length = str.length();
        for (int i = 1; i <= length; i++) {
            System.out.print(str.charAt(length-i));
        }

        System.out.println();
        System.out.println(str);
    }
}
