package day17;

import java.util.Scanner;

public class Day17_Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double result = 0;

        System.out.println("Enter a number:");
        double num1 = scan.nextInt();
        System.out.println("Enter another number:");
        double num2 = scan.nextInt();
        System.out.println("Enter a math operator (+,-,/,*");
        char operator = scan.next().charAt(0);
        scan.nextLine();

        while (!(operator == '+' || operator == '-' || operator == '/' || operator == '*')) {
            System.out.println("Invalid operator. Re-enter the operator:");
            operator = scan.next().charAt(0);
        }
        result = (operator == '+') ? num1 + num2 : (operator == '-') ? num1 - num2 : (operator == '/') ? num1 / num2 : num1 * num2;
        System.out.println(result);
    }
}
/*
write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */