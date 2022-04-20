package day39.AnimalTask;

public final class Dog extends FriendlyAnimal{

    public Dog(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }
    public void eat(){
        System.out.println(getName()+ " is eating dog food");
    }
    public void bark(){
        System.out.println(getName()+ " is barking");
    }
}
