package day38.employee;

public class ProductOwner extends Employee{

    public ProductOwner(String name,String companyName, int age, int id, double salary) {
        super(name, "Product Owner", companyName, age, id, salary);
    }
    public void work() {
        System.out.println(jobTitle+  " "+ name+ " is preparing User Stories");
    }


}
