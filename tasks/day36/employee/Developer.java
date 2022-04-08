package day36.employee;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void code(){
        System.out.println(name + " is coding");
    }

    public void fixBugs(){
        System.out.println(name + " is fixing bugs");
    }
}
