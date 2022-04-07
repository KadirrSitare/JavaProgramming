package day36_Inheritance.employeeTask;

import java.util.Arrays;

public class Company {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Ali","tester","Cydeo",'m',23,141,100000);

        Developer developer = new Developer();
        developer.setInfo("Veli","developer","Cydeo",'m',33,142,150000);

        Driver driver = new Driver();
        driver.setInfo("Deli","driver","Cydeo",'m',26,143,80000);

        Teacher teacher= new Teacher();
        teacher.setInfo("Jelly","teacher","Cydeo",'f',44,144,120000);

        tester.work();
        developer.code();
        driver.drive();
        teacher.work();
        System.out.println(Arrays.asList(tester, developer,driver, teacher));







    }
}
