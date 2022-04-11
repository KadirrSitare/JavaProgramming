package day38_Inheritance.car;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "white", 2021, 500, 10000);

        Tesla tesla = new Tesla("Model S", "black", 2020, 550, 20000);

        BMW bmw = new BMW("S400", "grey", 2019, 1550, 40000);

        toyota.start();
        tesla.start();
        bmw.start();


    }
}
