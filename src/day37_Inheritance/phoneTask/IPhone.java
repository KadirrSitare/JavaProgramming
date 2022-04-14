package day37_Inheritance.phoneTask;

public final class IPhone extends Phone{

    public IPhone(String model, String color, char size, double price) {
        super("Apple", model, color, size, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is facetiming "+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + " " + model + " is facetiming "+ email);
    }
}
