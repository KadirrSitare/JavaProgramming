package day44_Abstraction.carTask;

public final class Audi extends Car implements AutoPark{
    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " "+ getModel()+  " has autoPark features");
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " "+ getModel()+  " starts well");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " "+ getModel()+  " drives crazy");

    }
}
