package day11_Switch_Scanner;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 5;
        double n2 = 10;
        char operator = '/';

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);
            }
        } else {
            System.err.println("Invalid operator");
        }
    }
}
