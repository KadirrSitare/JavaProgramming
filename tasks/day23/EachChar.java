package day23;

public class EachChar {

    public static void main(String[] args) {

        printEachChar("kelime");

    }
    public static void printEachChar(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }



}
//create a method named printEachChar that can print each characters of a string