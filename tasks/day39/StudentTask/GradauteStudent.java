package day39.StudentTask;

public class GradauteStudent extends Student{
    public GradauteStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study(){
        System.out.println(getName()+ " is studying graduate level");
    }
}
