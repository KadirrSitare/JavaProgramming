package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Mike", 'M', 40, 90000);

        /*
        employee1.setName("John");
        employee1.setAge(50);
        employee1.setGender('M');
        employee1.setSalary(75000);

        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());
        System.out.println(employee1.getSalary());
        */
        System.out.println(employee1);

        Employee employee2 = new Employee("Nane", 'F', 50, 100000);

        employee2.setSalary(employee2.getSalary() + 15000);
        System.out.println(employee2);
    }
}
