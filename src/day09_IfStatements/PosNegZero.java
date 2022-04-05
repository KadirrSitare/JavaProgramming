package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int number = -150;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }
}
