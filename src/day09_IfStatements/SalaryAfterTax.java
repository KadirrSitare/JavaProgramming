package day09_IfStatements;

public class SalaryAfterTax {
    public static void main(String[] args) {

        int salary = 130000;
        double taxRate;
        boolean isMarried = false;

        if (salary >=130000){
            taxRate = 35;
        } else if (salary >=100000 && salary < 130000){
            taxRate = 30;
        } else if (salary >=80000 && salary < 100000){
            taxRate = 25;
        } else {
            taxRate = 20;
        }
        if (isMarried == true){
            taxRate = taxRate - 5;
        }
        System.out.println("Salary after tax is $" + salary * (100 - taxRate) / 100);
    }
}
/*Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax

 */