package day39.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        GradauteStudent gradauteStudent= new GradauteStudent("ali", 23,'m',141,"Business",'A',"Beverly");

        UndergradauteStudent undergradauteStudent = new UndergradauteStudent("Veli", 13,'m',222,"Finance",'B',"Mevlana");

        CydeoStudent cydeoStudent = new CydeoStudent("Lima", 35,'f',958,"SDET",'A',8,14,"Java");

        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.study();
        cydeoStudent.sleep();
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(undergradauteStudent,gradauteStudent,cydeoStudent));
        for (Student student : students) {
            System.out.println(student.getSchoolName());
        }



    }
}
