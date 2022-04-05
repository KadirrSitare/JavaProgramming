package day15_ForLoop;

import java.util.Scanner;

public class ReplaceWithA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        scan.close();

        if (word.charAt(0)== 'x'){
            String newWord = word.replaceFirst("x","a");
            System.out.println(newWord);
        }else {
            System.out.println(word);
        }

    }
}
/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */