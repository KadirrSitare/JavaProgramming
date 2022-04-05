package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName= scan.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName= scan.nextLine();

        System.out.println("Enter your city name");
        String cityName= scan.nextLine();

        System.out.println("Enter your state");
        String state= scan.next();

        System.out.println("Enter your zip code");
        String zipcode= scan.next();
        scan.close();

        String address = fullName + "\n" + buildingNumber + " " + streetName + "\n" + cityName + ","
                 + state + " " + zipcode;
        System.out.println(address);

    }
}
