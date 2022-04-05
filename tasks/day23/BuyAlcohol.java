package day23;

public class BuyAlcohol {

    public static void main(String[] args) {

        eligibleForAlcohol(22);

    }

    public static void eligibleForAlcohol(int age) {
        boolean isEligible = age >= 21;
        if (isEligible) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are NOT eligible");
        }

    }


}
// create a method that can check if a person is eligible to buy alcohol