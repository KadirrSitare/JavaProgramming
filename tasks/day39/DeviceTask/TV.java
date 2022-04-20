package day39.DeviceTask;

public class TV extends Device{
    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    int channel = 1;
    public void channelUp(){
        channel++;
        System.out.println("Channel is set to: "+ channel);
    }
    public void channelDown(){
        if(channel==1){
            return;
        }
        channel--;
        System.out.println("Channel is set to: "+ channel);
    }
}
