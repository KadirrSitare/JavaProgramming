package day27;

public class UpperLowerEqual {

    public static void main(String[] args) {

        String str = "JAVA java";
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                countUpper++;
            }else if (Character.isLowerCase(ch)){
                countLower++;
            }
        }
        boolean isEqual = countUpper == countLower;
        System.out.println(isEqual);

    }
}
/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */