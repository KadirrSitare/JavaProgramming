package day37_Inheritance.phoneTask;

public class Nokia extends Phone{
    public Nokia(String model, String color, char size, double price) {
        super("Nokia", model, color, size, price);
    }

    public void selfDefence(){
        System.out.println(brand + " "+ model + " is self defencing");
    }
}
