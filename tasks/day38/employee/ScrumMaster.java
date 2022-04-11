package day38.employee;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name,String companyName, int age, int id, double salary) {
        super(name, "Scrum Master", companyName, age, id, salary);
    }
    public void work() {
        System.out.println(jobTitle+  " "+ name+ " is conducting Daily Stand-up meeting");
    }
}
