package day39.AnimalTask;

public final class Lion extends WildAnimal{
    public Lion(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    public void hunt(){
        System.out.println(getName()+ " is hunting deer");
    }
}
