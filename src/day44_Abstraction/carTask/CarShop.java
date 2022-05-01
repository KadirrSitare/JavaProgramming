package day44_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        Audi audi = new Audi("A5", "white", 2021,45000);
        BMW bmw = new BMW("A5", "white", 2021,45000);
        CydeoCar cydeoCar = new CydeoCar("A5", "white", 2021,45000);
        Honda honda = new Honda("A5", "white", 2021,45000);
        Mercedes mercedes = new Mercedes("A5", "white", 2021,45000);
        Nio nio = new Nio("A5", "white", 2021,45000);
        Tesla tesla = new Tesla("A5", "white", 2021,45000);
        Toyota toyota = new Toyota("A5", "white", 2021,45000);


        tesla.selfDrive();
        cydeoCar.fly();
        System.out.println(mercedes);

    }
}
