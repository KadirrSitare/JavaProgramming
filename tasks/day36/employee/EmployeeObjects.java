package day36.employee;

import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Teacher teacher= new Teacher("Ali", "teacher", 'M',25,141,50000);
        Driver driver= new Driver("Veli", "driver", 'M',28,144,90000);
        Developer developer= new Developer("Kirk9", "developer", 'M',45,148,120000);
        Tester tester= new Tester("Elli", "tester", 'M',27,147,70000);

        tester.work();
        developer.fixBugs();
        driver.drive();
        teacher.gender= 'F';
        System.out.println(teacher);
        System.out.println(Arrays.asList(teacher,developer,driver,tester));

    }
}
