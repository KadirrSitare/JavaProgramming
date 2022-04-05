package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1  = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 1500;

        Employee employee2  = new Employee();
        employee2.name = "Mehmet";
        employee2.salary = 2000;

        Employee employee3  = new Employee();
        employee3.name = "Ummet";
        employee3.salary = 1800;

        System.out.println(employee1.name + " : " + employee1.salary + " " +employee1.isHuman);
        System.out.println(employee2.name + " : " + employee2.salary);
        System.out.println(employee3.name + " : " + employee3.salary);

    }

}
