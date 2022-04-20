package day39.AnimalTask;

public class WildAnimal extends Animal{

    public final static boolean isWild, isFriendly, isPlayable;

    static{
        isWild=true;
        isFriendly=false;
        isPlayable=false;
    }



    public WildAnimal(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age, isWild, isFriendly, isPlayable);

    }

    public void hunt(){
        System.out.println(getName()+ " is hunting");
    }

    public String toString() {
        return "Wild Animal{" +
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
