package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester = new Tester("Ali",41,'M',151,"QA",150000);

        Developer developer = new Developer("Veli",25,'M',121,"Senior Developer",200000);

        Teacher teacher =new Teacher("Deli",39,'F',161,"Selenium Teacher",180000);

        Student student = new Student("Really",29,'F',181,"Java");

        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(student);
        teacher.work();
        student.study();
        developer.work();
        tester.work();





    }
}
