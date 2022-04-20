package day39.AnimalTask;

public final class Cat extends FriendlyAnimal{

    public Cat(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }
    public void eat(){
        System.out.println(getName()+ " is eating cat food");
    }
    public void scratch(){
        System.out.println(getName()+ " is scratching");
    }
    public void meow(){
        System.out.println(getName()+ " is meowing");
    }
}

