package day39.AnimalTask;

public class FriendlyAnimal extends Animal{

    public   final static boolean isWild= false;
    public   final static boolean isFriendly = true;
    public   final static boolean  isPlayable=true;

    public FriendlyAnimal(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age, isWild, isFriendly, isPlayable);

    }

    public final void play(){
        System.out.println(getName()+ " is playing");
    }
    public final void pet(){
        System.out.println(getName()+ " is a pet");
    }

    public String toString() {
        return "Friendly Animal{" +
                "name='" + getName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
