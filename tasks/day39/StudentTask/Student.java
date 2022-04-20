package day39.StudentTask;

import java.rmi.ServerError;

public class Student extends Person{

    private final int studentId;
    private String fieldOfStudy;
    private char grade;
    private final String schoolName;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name,age, gender);
        if((studentId+"").startsWith("0")){
            System.err.println("Invalid Student ID");
            System.exit(1);
        }
        this.studentId = studentId;
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        if (schoolName == null || schoolName.isEmpty() || schoolName.isBlank()) {
            System.err.println("Invalid School Name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()) {
            System.err.println("Invalid Field of Study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void study(){
        System.out.println(getName()+ " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
 */