package day44_Abstraction.carTask;

public final class BMW extends Car{
    public BMW(String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+ getModel() + "starts by voice");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+ getModel() + "drives comfortably");
    }
}
