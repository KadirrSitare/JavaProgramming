package day39.DeviceTask;

public class Phone extends Device{
    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getBrand()+ " "+ getModel()+ " is calling "+ phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(getBrand()+ " "+ getModel()+ " is texting to "+ phoneNum);
    }
}
