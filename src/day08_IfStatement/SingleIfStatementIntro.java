package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 303;
        boolean evenNumber = number%2 == 0;
        if (evenNumber) {  //false
            System.out.println(number + " is even number");
        }

        if (!evenNumber) { //true
            System.out.println(number + " is odd number");
        }
        System.out.println("-----------------------");

        int n = 0;
        //positive
        if (n > 0) { //if n is greater than zero, than it's positive
            System.out.println(n + " is positive");
        }
        if (n < 0) { //if n is less than zero, than it's negative
            System.out.println(n + " is negative");
        }
        if (n == 0) { //if n is equal to zero, than it's zero
            System.out.println(n + " is zero");
        }
    }
}
