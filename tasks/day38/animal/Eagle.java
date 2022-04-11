package day38.animal;

public class Eagle extends Animal{
    public Eagle(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    public void eat() {
        System.out.println(name+ " eats eagle food");
    }
}
