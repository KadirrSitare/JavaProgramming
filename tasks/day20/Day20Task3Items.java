package day20;

public class Day20Task3Items {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        String item = "";
        double price = 0;
        int itemID = 0;

        for (int i = 0; i < items.length; i++) {
            item = items[i];

            if (item.equalsIgnoreCase("Gloves")) {
                System.out.println(i);
                break;
            }
        }
        for (int i = 0; i < items.length; i++) {
            item = items[i];
            if (item.equalsIgnoreCase("iPad")) {
                System.out.println("List contains iPad");
            }
        }
        for (int i = 0; i < items.length; i++) {
            item = items[i];
            price = prices[i];
            itemID = itemIDs[i];
            System.out.println(item + " - "+price+ " - " + itemID);
        }



    }
}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */