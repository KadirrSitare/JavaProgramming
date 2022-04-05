package day33;

public class CydeoStudent {

    public String name;
    public int age, ID, batchNumber, groupNumber;
    public char gender, grade;
    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, int age, int ID, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;

    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void attendClass() {
        System.out.println(name + " is attending to the class");

    }

    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    public static void printProgLanguage() {
        System.out.println(programmingLanguage);
    }

    public static void printSecretCode() {
        System.out.println(secretCode);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                ", school name=" + schoolName +
                ", programming language=" + programmingLanguage +
                ", secret code=" + secretCode +
                '}';
    }

}
/*
Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */