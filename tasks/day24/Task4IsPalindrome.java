package day24;

public class Task4IsPalindrome {

    public static void main(String[] args) {


        System.out.println(isPalindrome("vavav"));
    }

    public static boolean   isPalindrome(String str){

        String str2 = Task3ReverseString.reverseString(str);
        boolean isPalindrome = str.equals(str2);
        return isPalindrome;
    }


}
/*
By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */