package day38.employee;

public class Pilot extends Employee{
    public Pilot(String name, String jobTitle, String companyName, int age, int id, double salary) {
        super(name, jobTitle, companyName, age, id, salary);
    }

    public void work() {
        System.out.println(jobTitle+  " "+ name+ " is flying");
    }
}
