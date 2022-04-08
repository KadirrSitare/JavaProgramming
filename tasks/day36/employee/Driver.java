package day36.employee;

public class Driver extends Employee{
    public Driver(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void drive(){
        System.out.println(name + " is driving");
    }
}
