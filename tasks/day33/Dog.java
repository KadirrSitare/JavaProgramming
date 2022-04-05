package day33;

public class Dog {

    public String breed, color;
    public char size, gender;
    public int age;
    public static int numberOfLegs = 4;
    public static int numberOfEyes = 2;
    public static int numberOfWings = 0;
    public static boolean isFriendly = true;

    public Dog(String breed, String color, char size, char gender, int age) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println(breed + " is eating");
    }
    public void sleep(){
        System.out.println(breed + " is sleeping");
    }
    public void play(){
        System.out.println(breed + " is playing");
    }
}
/*
Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */