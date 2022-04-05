package day31_Constructors.ScrumTask;

public class Developer {

    public String name;
    public long employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void unitTesting() {
        System.out.println(name + " is unit Testing");
    }

    public void fixingBug() {
        System.out.println(name + " is fixing Bug");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
