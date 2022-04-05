package day17_While_DoWhile;

public class FrequencyOfACharInAString {

    public static void main(String[] args) {

        String str = "dskfjsdjfkgkjdnvknbrnbkjnfb";
        char ch = 'd';

        int freq = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)== ch){
                freq += 1;
            }
        }
        System.out.println(freq);
    }
}
/*
Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */