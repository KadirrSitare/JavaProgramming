package day44_Abstraction.carTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String model, String color, int year, double price) {
        super("CydeoCar", model, color, year, price);
    }

    public void autoPark() {
        System.out.println(getMake()+ " "+ getModel()+  " has autoPark features");

    }

    public void selfDrive() {
        System.out.println(getMake()+ " "+ getModel()+  " is self driving");

    }

    public void start() {
        System.out.println(getMake()+ " "+ getModel()+  " starts crazy");

    }

    public void drive() {
        System.out.println(getMake()+ " "+ getModel()+  " drives crazy");

    }

    public void fly() {
        System.out.println(getMake()+ " "+ getModel()+  " flies high");

    }
}
