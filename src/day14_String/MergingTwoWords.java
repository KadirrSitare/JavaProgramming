package day14_String;

import java.util.Scanner;

public class MergingTwoWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String word1 = scan.next();
        System.out.println("Enter the second word:");
        String word2 = scan.next();
        scan.close();
        char a = word1.charAt(word1.length() - 1);
        char b = word2.charAt(0);

        if (a == b) {
            System.out.println(word1 + word2.substring(1));
        } else {
            System.out.println(word1 + word2);
        }
    }
}
/* Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight*/