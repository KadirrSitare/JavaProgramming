package day35.pizza;

public class Test {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("null",9,4);
        System.out.println(pizza1);
pizza1.setNumberOfPepperoniToppings(5);
        System.out.println(pizza1);

    }
}
