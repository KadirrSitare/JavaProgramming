package day38.animal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Smoke","British","Medium","white",2,'M');
        Dog dog = new Dog("Doggy","Kangal","Medium","black",3,'M');
        Tiger tiger = new Tiger("Kukrek","Bengal","Large","orange",4,'F');
        Eagle eagle = new Eagle("Kara","Bald","Medium","black",1,'M');

        cat.eat();
        dog.eat();
        tiger.eat();
        eagle.eat();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.addAll(Arrays.asList(cat,dog,tiger,eagle));
        System.out.println(animals);


    }

}
