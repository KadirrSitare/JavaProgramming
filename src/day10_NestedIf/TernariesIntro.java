package day10_NestedIf;

import java.sql.SQLOutput;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); //String
        } else {
            System.out.println("Odd"); //String
        }
        System.out.println("--------------------");

        String result1 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("--------------------");

        int age = 17;

        /*
        if (age>=21){

            System.out.println("Eligible"); // String
        } else {
            System.out.println("Not eligible"); //String
        }
            */


        //System.out.println( (age >=21)? "Eligible" : "Not eligible");
        String result2 = (age >= 21) ? "Eligible" : "Not eligible";
        System.out.println(result2);

        System.out.println("--------------------");

        int number = 0;

        String result3 = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";

        System.out.println(result3);


    }
}
