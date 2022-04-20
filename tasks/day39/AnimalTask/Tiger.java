package day39.AnimalTask;

public final class Tiger extends WildAnimal{
    public Tiger(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    public void hunt(){
        System.out.println(getName()+ " is hunting buffalo");
    }
}
