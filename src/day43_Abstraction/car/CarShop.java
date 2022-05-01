package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        //Car car = new Car("Cydeo", "25", "blue",2019,25000);
        // we cannot create object from Abstract class, because abstract class is not concrete.
        Honda honda = new Honda("Civic", "white", 2020,35000);
        Audi audi = new Audi("A5","grey",2022,100000);
        Tesla tesla = new Tesla("Model3","black",2025,600000);

        System.out.println(honda + " " + audi+ " "+tesla);
        honda.setColor("Red");
        audi.setPrice(120000);

        System.out.println(honda);
        System.out.println(audi);

    }
}
