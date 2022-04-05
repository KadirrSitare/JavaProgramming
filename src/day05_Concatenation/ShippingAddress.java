package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
        String name = "Jack Daniels";
        String buildingNumber = "1452"; */
        String name = "Jack Daniels",
                buildingNumber = "11254D",
                streetName = "Flower Dr",
                city = "McLean",
                state = "VA",
                zipcode = "22031A";
      /*  System.out.println(name + "\n" + buildingNumber +
                " " + streetName + "\n" + city + ", " + state + " " + zipcode);
                */
          String address = name + "\n" + buildingNumber +
                  " " + streetName + "\n" + city + ", " + state + " " + zipcode;
        System.out.println(address);


    }
}
