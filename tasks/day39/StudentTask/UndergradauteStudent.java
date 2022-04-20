package day39.StudentTask;

public class UndergradauteStudent extends Student{
    public UndergradauteStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study(){
        System.out.println(getName()+ " is studying undergraduate level");
    }
}
