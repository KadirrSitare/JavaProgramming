package day25_CustomMethod_Overloading;

public class sumOfNumbers {

    public static void main(String[] args) {

        int sum = sumOf2Numbers(5, 10);
        System.out.println(sum);

        int sum2 = sumOf3Numbers(5, 10, 15);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf4Numbers(5, 10, 15, 20);
        System.out.println(sum3);

    }

    public static int sumOf2Numbers(int num1, int num2) {

        int sum = num1 + num2;
        return sum;

    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {

        int sum = num1 + num2 + num3;
        return sum;

    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {

        return num1 + num2 + num3 + num4;
    }

}
/*
1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

 */