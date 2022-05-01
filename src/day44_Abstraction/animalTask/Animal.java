package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name, size;
    private final String breed, color;
    private  final char gender;
    private int age;

    public final static boolean canBreathe = true;

    public Animal(String name, String size, String breed, String color, char gender, int age) {
        setName(name);
        setSize(size);
        this.breed = breed;
        this.color = color;
        if(!(gender=='M' || gender =='F')){
            throw new RuntimeException("Invalid gender: "+ gender);
        }
        this.gender = gender;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()||name.isBlank()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new RuntimeException("Invalid age: "+ age);
        }
        this.age = age;
    }

    public abstract void eat();

    public final void drink(){
        System.out.println(name+ " drinks water");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a cosntructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake

 */