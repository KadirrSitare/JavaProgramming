package day24;

import java.util.Arrays;

public class Task2IsAnagram {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "dcba";
        boolean anagram = isAnagram(str1,str2);
        System.out.println(anagram);


    }
    public static boolean isAnagram(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        boolean isAnagram = Arrays.equals(ch1,ch2);
        return isAnagram;
    }


}
/*
 create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */
