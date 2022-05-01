package day44_Abstraction.carTask;

public final class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " "+ getModel() + "starts fast");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " "+ getModel() + "drives fast");
    }
}
