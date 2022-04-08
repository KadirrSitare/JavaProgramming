package day36.employee;

public class Employee {

    public String name, jobTitle;
    public char gender;
    public int age, id;
    public double salary;

    public Employee(String name, String jobTitle, char gender, int age, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Employee Task:
	2.1 Create a class named Employee:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				toString()


	2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()


	2.3 Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()

	2.4 Create the sub class of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching
				toString()

	2.5 Create the sub class of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching()
				toString()

	2.6 Create the sub class of Employee named Driver:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				drivering()
				toString()

	2.7 Create a class named Employee Objects and and test of the sub class' objects
 */
