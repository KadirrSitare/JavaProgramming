package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'F';

        switch (grade){
            case ('A'): // If A or B or C or D print "passed".
                // It is the way of applying OR logic in switch statements
            case ('B'):
            case ('C'):
            case ('D'):
                System.out.println("Passed");
                break;
            case ('F'):
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid grade");
        }
    }
}

