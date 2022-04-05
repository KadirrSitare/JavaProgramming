package day33;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Okocha", 55, 'M');
        person1.eat("banana");
        person1.drink("milk");
        person1.sleep();
        System.out.println(person1);
        if (person1.hasNose){
            System.out.println(person1.name + " has nose");
        }

    }


}
