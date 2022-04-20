package day39.AnimalTask;

public final class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }
    public void eat(){
        System.out.println(getName()+ " is eating fish food");
    }
    public void swim(){
        System.out.println(getName()+ " is swimming");
    }
}
