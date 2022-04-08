package day36.employee;

public class Tester extends Employee{

    public Tester(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void test(){
        System.out.println(name + " is testing");
    }
    public void createTicket(){
        System.out.println(name + " is creating ticket");
    }

}
