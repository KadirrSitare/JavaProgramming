package day13_StringClass;

import java.util.Scanner;

public class FirstAndLastCharacterSame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        scan.close();
        boolean same = str.charAt(0) == str.charAt(str.length() - 1);

        if (same) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }
}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */