package day39.AnimalTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        Bear bear = new Bear("Koca Ayi", "large", "giant", "grey", 'M', 10);
        Cat cat = new Cat("Duman", "large", "British", "black", 'M', 10);
        Crocodile crocodile = new Crocodile("Greeny", "medium", "giant", "green", 'M', 18);
        Dog dog = new Dog("Kopus", "small", "Kangal", "white", 'F', 4);
        Dolphin dolphin = new Dolphin("Cute", "small", "Sensitive", "white", 'F', 4);
        Eagle eagle = new Eagle("Citir", "small", "Bald", "red", 'F', 4);
        Lion lion = new Lion("King", "small", "African", "brown", 'F', 6);
        Parrot parrot = new Parrot("Bulbul", "small", "Australian", "colorful", 'F', 3);
        Python python = new Python("Sokar", "small", "Nigerian", "black", 'M', 41);
        Tiger tiger = new Tiger("Titrek", "large", "Bengal", "orange", 'F', 7);

       ArrayList<WildAnimal> wilds = new ArrayList();
        ArrayList<FriendlyAnimal> friendlies = new ArrayList();
       ArrayList<Animal> animals = new ArrayList(Arrays.asList(cat,crocodile,dog,tiger));

        for (Animal each : animals) {
            if(each.isFriendly) {
                friendlies.add((FriendlyAnimal) each);
            }
            if(each.isWild){
                wilds.add((WildAnimal) each);
            }
        }
        System.out.println(animals.get(0));
        System.out.println(cat.isFriendly);
        dog.bark();
        cat.eat();
        parrot.fly();
        System.out.println(parrot.isWild);

        System.out.println(wilds);
        System.out.println(friendlies);


    }
}
