package day33;

public class Iphone {

    public String model, color;
    public double price;
    public char size;
    public static String brand = "Apple";
    public static String OS = "iOS";
    public static String madeIn = "China";

    public Iphone(String model, String color, double price, char size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }
    public void faceTime(long phoneNumber){
        System.out.println("Face Time calling "+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("Face Time calling "+ email);
    }
    public void call(long phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Texting "+ phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
/*
Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */