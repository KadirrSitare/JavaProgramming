package day38.employee;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name,String companyName, int age, int id, double salary) {
        super(name, "Business Analyst", companyName, age, id, salary);
    }

    public void work() {
        System.out.println(jobTitle+  " "+ name+ " is analyzing the documents");
    }
}
