package day38.employee;

public class Driver extends Employee{
    public Driver(String name,  String companyName, int age, int id, double salary) {
        super(name, "Driver", companyName, age, id, salary);
    }
    public void work() {
        System.out.println(jobTitle+  " "+ name+ " is driving");
    }
}
