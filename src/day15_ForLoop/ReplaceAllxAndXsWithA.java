package day15_ForLoop;

import java.util.Scanner;

public class ReplaceAllxAndXsWithA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        scan.close();

        String newWord = word.replace("x","a").replace("X", "a");
        System.out.println(newWord);
    }
}
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */