package day03_EscapeSequences.day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=
        boolean result1 = 20 > 40; //false
        System.out.println("result1 = " + result1);

        boolean result2 = 150 >= 150; //true
        System.out.println("result2 = " + result2);

        boolean result3 = 150 < 100; //false
        System.out.println("result3 = " + result3);

        boolean result4 = 150<=250; //true
        System.out.println("result4 = " + result4);

        //credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >=720; //if the credit score is 720 or greater, then it is eligible for credit
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);


        int score = 59;
        boolean hasFailed = score<=59; //true
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("-------------------------------");

        // ==, !=
        int x = 100;
        int y = 200;
        boolean isEqual = x==y; //false
        System.out.println("isEqual = " + isEqual);

        boolean result8 = "Muhtar" == "Good Guy"; //false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //false
        System.out.println("result9 = " + result9);

        boolean result10 = "java" == "java"; //true
        System.out.println("result10 = " + result10);

        System.out.println("-------------------------------");

        boolean result11 = 100 != 200; //true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; //false
        System.out.println("result13 = " + result13);


    }
}
