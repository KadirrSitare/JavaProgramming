package day36.employee;

public class Teacher extends Employee{
    public Teacher(String name, String jobTitle, char gender, int age, int id, double salary) {
        super(name, jobTitle, gender, age, id, salary);
    }

    public void teach(){
        System.out.println(name + " is teaching");
    }
}
