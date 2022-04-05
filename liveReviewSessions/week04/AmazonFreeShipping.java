package week04;

public class AmazonFreeShipping {

    public static void main(String[] args) {

        double totalPrice = 10;

        if (totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBILE. Your order total: " + totalPrice + "$");
        } else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalPrice + ". less than minimum of $25");
        }
    }
}
