package day39.DeviceTask;

public class Computer extends Device{
    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void playGame(){
        System.out.println(getBrand()+ " "+ getModel()+ " is playing game");
    }
}
