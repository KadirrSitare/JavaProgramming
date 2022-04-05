package week05;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 5-letter palindrome:");
        String palindrome = scan.next();
        scan.close();
        char a = palindrome.charAt(0);
        char b = palindrome.charAt(1);
        char c = palindrome.charAt(2);
        char d = palindrome.charAt(3);
        char e = palindrome.charAt(4);
        if ((a==e) && (b==d)){
            System.out.println("It is a great palindrome");
        }else {
            System.out.println("Come ooooon. It is not a palindrome");
        }
    }
}
