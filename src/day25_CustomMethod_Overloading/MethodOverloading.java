package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {
        int[] intArray = {5, 6, 0, 2, 4, 7};
        Arrays.sort(intArray);

        double[] doubleArray = {10, 5.5, 4.2, 3.6};
        Arrays.sort(doubleArray);

        char[] charArray = {'a', 'v', 'd', 'b'};
        Arrays.sort(charArray);

        System.out.println("----------------------------------------------");

//sum of 10 and 20
        int sum1 = sumOfNumbers(10,20);

        // sum of 10, 20, 30
        int sum2 = sumOfNumbers(10, 20, 30);

        // sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10, 20, 30, 40);

        // sum of 18.2 and 30.7
        double sum4 = sumOfNumbers(18.2, 30.7);

        //sum of 5.5, 4.5, 6.5
        double sum5 = sumOfNumbers(4.5 , 5.5, 6.5);

        // sum of 4.5, 3.5, 2.5, 6.5
        double sum6 = sumOfNumbers(4.5 , 3.5, 2.5, 6.5);

    }

    public static int sumOfNumbers(int num1, int num2) {

        int sum = num1 + num2;
        return sum;

    }

    public static int sumOfNumbers(int num1, int num2, int num3) {

        int sum = num1 + num2 + num3;
        return sum;

    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2) {

        double sum = num1 + num2;
        return sum;

    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return sumOfNumbers(num1, num2)+ num3;

    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return sumOfNumbers(num1,num2,num3)+ num4;

    }
}
