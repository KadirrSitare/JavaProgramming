package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {
        Person person1 = new Person("John",'M', 35);

        System.out.println(person1);

        Person person2 = new Person("Jane", 'F', 25);

        person2.age = 30;

        System.out.println(person2);

    }
}
