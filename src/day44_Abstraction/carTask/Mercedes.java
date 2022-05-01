package day44_Abstraction.carTask;

public final class Mercedes extends Car implements AutoPark{
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " "+ getModel()+  " has autoPark features");
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
