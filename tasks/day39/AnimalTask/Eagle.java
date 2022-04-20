package day39.AnimalTask;

public final class Eagle extends WildAnimal{
    public Eagle(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }
    public void hunt(){
        System.out.println(getName()+ " is hunting snake");
    }
    public void fly(){
        System.out.println(getName()+ " is flying high");
    }
}
