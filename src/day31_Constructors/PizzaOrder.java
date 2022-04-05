package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {

    public static void main(String[] args) {


        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza pizza1 = new Pizza('S',2,2);
            Pizza pizza2 = new Pizza('M',3,4);
            Pizza pizza3 = new Pizza('L',4,5);
            pizzas.addAll(Arrays.asList(pizza1,pizza2,pizza3 ));
        }

        System.out.println(pizzas.size());

        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);


    }
}
