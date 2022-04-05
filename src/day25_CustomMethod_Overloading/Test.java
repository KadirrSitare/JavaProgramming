package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("--------------------------");

        String str2 = "Wooden Spoon";

        String reverse = StringUtility.reverse(str2);
        System.out.println(reverse);

        System.out.println("--------------------------");

        String word = "Civic";
        boolean isPalindrome = StringUtility.isPalindrome(word);
        System.out.println("isPalindrome = " + isPalindrome);

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("--------------------------");

        String str3 = "aaaaaaaaaaaabbbbbbbbbbbbcccccccdddd";
        String removed = StringUtility.removeDuplicates(str3);
        System.out.println(removed);



    }


}
