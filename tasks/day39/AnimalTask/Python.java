package day39.AnimalTask;

public class Python extends WildAnimal{
    public Python(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }
    public void hunt(){
        System.out.println(getName()+ " is hunting rat");
    }
    public void code(){
        System.out.println(getName()+ " is coding");
    }
}
