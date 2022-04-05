package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "abcdabcdABCD";
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (str2.contains(ch + "")) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }

            }
            System.out.print(""+str.charAt(i) + count);
            str2 += "" + ch;
        }

    }
}
/*
 Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */