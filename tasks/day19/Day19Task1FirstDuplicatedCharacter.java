package day19;

public class Day19Task1FirstDuplicatedCharacter {

    public static void main(String[] args) {

        String str = "adbvgnhghg";
        String str2 = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("" + ch);
                break;
            }

        }

    }
}
/*
Write a program that can return the first duplicated character from a string
 */