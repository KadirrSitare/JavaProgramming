package day19;

public class Day19Task2IndexNumberOfFirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "nnggp";
        String str2 = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (str2.contains(ch+"")){
                continue;
            }
            count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(i);
                break;
            }
            str2 += ch;
        }

    }

}
/*
Write a program that can return the index number of the first unique character. */