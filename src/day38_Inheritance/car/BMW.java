package day38_Inheritance.car;

public class BMW extends Car{
    public BMW( String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }

    public void breaksDown(){
        System.out.println(brand +" "+ model + " is breaking down");
    }

    public void racing(){
        System.out.println(brand +" "+ model + " is racing");
    }

    public void start() {
        System.out.println("Call the mechanic to start "+  brand + " "+ model);
    }
}
