package day38.employee;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, String companyName, int age, int id, double salary) {
        super(name, jobTitle, companyName, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+  " "+ name+ " is testing");
    }
}
