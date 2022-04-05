package day21;

public class CountPalindrome {

    public static void main(String[] args) {

       String[] words= {"anna", "level", "Java", "aba","delicios","a"};
       int count = words.length;

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                int last = word.length()-1;
                if(word.length()== 1 || word.charAt(i)!=word.charAt(last-i)){
                    count--;
                    break;
                }
            }
        }
        System.out.println("count = " + count);

    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */