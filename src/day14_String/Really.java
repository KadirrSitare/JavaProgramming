package day14_String;

import java.util.Scanner;

public class Really {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        scan.close();
        if ((word.substring(word.length()-2)).equals("ly")){
            System.out.println("Really???");
        }else {
            System.out.println("never mind");
        }
    }
}
/*ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"*/
