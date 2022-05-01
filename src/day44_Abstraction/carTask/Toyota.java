package day44_Abstraction.carTask;

public final class Toyota extends Car{
    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+ getModel() + "turned the key");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+ getModel() + "driving slow");
    }
}
