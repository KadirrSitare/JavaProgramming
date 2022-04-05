package day24_CustomMethod_Return;

public class ReturnMethodsPractice3 {

    public static void main(String[] args) {


        String str = "aaaabbwccfgf";
        for (int i = 0; i < str.length(); i++) {

            int count = frequencyOfChars(str, str.charAt(i));
            if (count == 1) {
                System.out.println(str.charAt(i));
            }
        }
    }

    public static int frequencyOfChars(String str, char ch) {

        int freq = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                freq++;
            }
        }
        return freq;

    }


}
