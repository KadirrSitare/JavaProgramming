package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        //oddOrEven ();  //  oddOrEven(); // the method demands additional info to complete its task
        oddOrEven(8);

        ageOfPerson(1955);

        printNumbers(15, 5);

    }

    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;

        System.out.println("Your age is " + age);
    }

    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int number1, int number2) {

        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = number1; i >= number2; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
