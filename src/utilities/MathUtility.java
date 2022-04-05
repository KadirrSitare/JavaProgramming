package utilities;

public class MathUtility {



    public static int sum(int num1, int num2){
        return num1+num2;
    }

    public static double sum(double num1, double num2){
        return num1+num2;
    }

    public static int subtract(int num1, int num2){
        return num1-num2;
    }

    public static double subract(double num1, double num2){
        return num1-num2;
    }

    public static int multiplication(int num1, int num2){
        return num1*num2;
    }

    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    public static double division(double num1, double num2){
        return num1/num2;
    }

    public static boolean isEven(int number){
        boolean isEven= number%2 ==0;
        return isEven;
    }

    public static boolean isOdd(int number){
        boolean isOdd= number%2 !=0;
        return isOdd;
    }

    public static int maxNumber(int num1, int num2){
        int maxNumber = num1;
        if (num2>num1){
            maxNumber = num2;
        }
        return maxNumber;
    }

    public static double maxNumber(double num1, double num2){
        double maxNumber = num1;
        if (num2>num1){
            maxNumber = num2;
        }
        return maxNumber;
    }

    public static int minNumber(int num1, int num2){
        int minNumber = num1;
        if (num2<num1){
            minNumber = num2;
        }
        return minNumber;
    }

    public static double minNumber(double num1, double num2){
        double minNumber = num1;
        if (num2<num1){
            minNumber = num2;
        }
        return minNumber;
    }

    public static int square(int number){
        return number * number;
    }

    public static double square(double number){
        return number * number;
    }

    public static int cube(int number){
        return number * number * number;
    }

    public static double cube(double number){
        return number * number * number;
    }

}
/*
Create a class called MathUtility under the utility package:

			2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double
 */