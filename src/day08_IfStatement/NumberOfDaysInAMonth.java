package day08_IfStatement;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {

        int number = 1;

        boolean days30 = number == 4 || number ==6 || number == 9 || number ==11;
        boolean days28 = number == 2;
        boolean days31 = !days30 && !days28;
        //boolean days31 = number == 1 || number ==3 || number == 5 || number ==7 || number == 8 || number ==11;

        if (days31) { //if the month has 31 days
            System.out.println("31 Days");
        }
        if (days30) {
            System.out.println("30 Days");
        }
        if (days28) {
            System.out.println("28 Days");
        }
    }
}
/*
Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */