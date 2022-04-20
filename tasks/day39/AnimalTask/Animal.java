package day39.AnimalTask;

public class Animal {

    private String name, size;
    private final String breed;
    private final String color;
    private final char gender;
    private int age;

    public boolean isWild, isFriendly, isPlayable;


    public Animal(String name, String size, String breed, String color, char gender, int age, boolean isWild,boolean isFriendly, boolean isPlayable) {
        this.isWild= isWild;
        this.isFriendly= isFriendly;
        this.isPlayable = isPlayable;
        setName(name);
        setSize(size);
        if (breed==null){
            System.err.println("Breed cannot be null.");
            System.exit(1);
        }
        if (breed.isEmpty()||breed.isBlank()){
            System.err.println("Breed cannot be empty or blank.");
            System.exit(1);
        }
        this.breed = breed;
        if (color==null){
            System.err.println("Color cannot be null.");
            System.exit(1);
        }
        if (color.isEmpty()||color.isBlank()){
            System.err.println("Color cannot be empty or blank.");
            System.exit(1);
        }
        this.color = color;
        if (!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender: "+ gender);
            System.exit(1);
        }
        this.gender = gender;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
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

    public void setName(String name) {
        if (name==null){
            System.err.println("Name cannot be null.");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Name cannot be empty or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }
    public final void drink(){
        System.out.println(name+ " is drinking water");
    }
    public final void sleep(){
        System.out.println(name+ " is sleeping");
    }
    public final void move(){
        System.out.println(name+ " is moving");
    }

    public String toString() {
        return "Animal{" +
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
1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()


	2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()

	3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()


	4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()


	5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile


	6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */