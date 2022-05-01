package day44_Abstraction.carTask;

public final class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " "+ getModel()+  " has autoPark features");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+ " "+ getModel()+  " is self driving");
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " "+ getModel()+  " starts fast");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " "+ getModel()+  " drives perfect");
    }
}
