package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 100,
                num2 = 50,
                add = num1 + num2,
                subtract = num1 - num2,
                multiply = num1 * num2;

        String addition = num1 + " + " + num2 + " = " + add;
        String subtraction = num1 + " - " + num2 + " = " + subtract;
        String multiplication = num1 + " * " + num2 + " = " + multiply;

        System.out.println(addition); // System.out.println(num1 + " + " + num2 + " = " + (num1 + num2);
        System.out.println(subtraction);
        System.out.println(multiplication);
    }
}
