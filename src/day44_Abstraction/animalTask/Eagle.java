package day44_Abstraction.animalTask;

public final class Eagle extends Animal{
    public Eagle(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats snake");
    }

    public void fly(){
        System.out.println(getName()+ " flies high");
    }
}
