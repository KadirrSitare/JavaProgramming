package day18;

import java.util.Scanner;

public class Day18_Task3_Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "";
        String answer = "";
        double num1, num2, result;

        while (true) {
            System.out.println("Enter the first number:");
            num1 = scan.nextInt();
            System.out.println("Enter a math operator (+-/*):");
            str = scan.next();
            while (!(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*"))) {
                System.out.println("Invalid operator. \nPlease re-enter a valid math operator:");
                str = scan.next();
            }
            System.out.println("Enter the second number:");
            num2 = scan.nextInt();
            result = (str.equals("+")) ? num1 + num2 : str.equals("-") ? num1 - num2 : str.equals("*") ? num1 * num2 : num1 / num2;
            System.out.println("Result is " + result);
            System.out.println("Do you want to continue? yes/no");
            answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid answer. \nDo you want to continue? yes/no");
                answer = scan.next();
            }
            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }
        scan.close();
    }
}
/*
Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */