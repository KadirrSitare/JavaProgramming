package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitolOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Ali", 141,'M',"SDET",75000,false);

        Employee employee2 = new Employee();
        employee2.setInfo("Veli", 142,'M',"Developer",85000,true);

        Employee employee3 = new Employee();
        employee3.setInfo("Deli", 143,'M',"BA",65000,true);

        Employee employee4 = new Employee();
        employee4.setInfo("Elly", 144,'F',"PO",95000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Sally", 145,'F',"Scrum Master",45000,false);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));

        int countOfFullTime = 0;
        int countOfPartTime = 0;
        double minSalary = Integer.MAX_VALUE;
        double maxSalary = Integer.MIN_VALUE;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                countOfFullTime++;
            }else {
                countOfPartTime++;
            }
            if (employee.salary<minSalary){
                minSalary = employee.salary;
            }
            if (employee.salary>maxSalary){
                maxSalary = employee.salary;
            }
        }
        System.out.println("countOfFullTime = " + countOfFullTime);
        System.out.println("countOfPartTime = " + countOfPartTime);
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);

    }
}
/*
1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */