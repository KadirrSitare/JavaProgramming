package day27;

public class LetterDigitSpecialChar {

    public static void main(String[] args) {

        String letters= "";
        String digits = "";
        String specialChars = "";

        String str = "Wooden Spoon123!";
        char [] characters = str.toCharArray();

        for (char each : characters) {
            if (Character.isAlphabetic(each)){
                letters += each;
            }else if (Character.isDigit(each)){
                digits += each;
            }else {
                specialChars += each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

}
/*
Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */