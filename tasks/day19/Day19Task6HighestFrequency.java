package day19;

public class Day19Task6HighestFrequency {

    public static void main(String[] args) {

        String str = "aaabbbbrty";
        int highestFreq = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    freq++;
                }
            }
            if (freq > highestFreq) {
                highestFreq = freq;
            }
        }
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    freq++;
                }
            }
            if (freq == highestFreq && !result.contains(ch + "")){
                result += ch;
            }
        }
        System.out.println(result);
    }
}
/*
Write a program that can find the character that has the highest frequency from a string
 */