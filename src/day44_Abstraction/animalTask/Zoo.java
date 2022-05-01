package day44_Abstraction.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Duman", "small", "Van", "white", 'F', 2);

        Dog dog1 = new Dog("Canavar", "medium", "Kangal", "brown", 'F', 6);
        Eagle eagle1 = new Eagle("Kel", "small", "Bald", "black", 'M', 4);
        Parrot parrot1 = new Parrot("Cafer", "small", "Paradise", "red", 'M', 4);
        Tiger tiger1 = new Tiger("Kukrek", "small", "Bengal", "orange", 'F', 5);

        System.out.println(tiger1);
        cat1.eat();
        dog1.setAge(25);
        System.out.println(dog1);
        parrot1.drink();
        eagle1.fly();
        tiger1.eat();
        cat1.setName("Miskin");
        System.out.println(cat1.getName().toUpperCase().substring(0,3));

    }
}
