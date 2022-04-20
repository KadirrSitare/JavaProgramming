package day39.AnimalTask;

public final class Parrot extends FriendlyAnimal{
    public Parrot(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }
    public void eat(){
        System.out.println(getName()+ " is eating bird food");
    }
    public void fly(){
        System.out.println(getName()+ " is flying");
    }
    public void sing(){
        System.out.println(getName()+ " is singing");
    }
}
