package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your hourly Rate");
        int hourlyRate = scan.nextInt();
        System.out.println("how many hours do you work in a week");
int hours = scan.nextInt();
        System.out.println("enter state tax (in percentage)");
double stateTax = scan.nextDouble();
        System.out.println("enter federal tax (in percentage)");
        double federalTax = scan.nextDouble();
        scan.close();
        double salary = hourlyRate *   hours;
        double stateTax2 = salary * stateTax;
        double federalTax2 = salary* federalTax;
        double totalTax = stateTax2+ federalTax2;
        double netIncome = salary - totalTax ;
        System.out.println("salary = $" + salary);
        System.out.println("stateTax2 = $" + stateTax2);
        System.out.println("federalTax2 = $" + federalTax2);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("netIncome = $" + netIncome);


    }
}
/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */