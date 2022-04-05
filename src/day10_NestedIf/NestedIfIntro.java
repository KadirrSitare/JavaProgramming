package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;
        if (score >= 0 && score <= 100) { //if score is valid

            if (score >= 60) { // if student passed the exam
                System.out.println("passed");
            } else { // if the student failed the exam
                System.out.println("failed");
            }
        } else { //if the score is not valid
            System.out.println("Invalid score");
        }
        System.out.println("-------------------------");

        int age = 25;
        boolean hasId = false;

        if (hasId) {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        } else {
            System.out.println("You must have an ID to buy alcohol");
        }
        System.out.println("-------------------------");

        int number = -6;


        if (number >= 1 && number <= 7) { //if the number is a valid number (1~7)
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else { //if the number is not valid
            System.out.println("The number is NOT valid");
        }


    }
}
