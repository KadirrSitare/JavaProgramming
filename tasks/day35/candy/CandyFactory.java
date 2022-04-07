package day35.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy1 = new Candy("A",1,0,true);
        Candy candy2 = new Candy("B",2,10,false);
        Candy candy3 = new Candy("C",3,20,true);
        Candy candy4 = new Candy("D",4,15,false);
        Candy candy5 = new Candy("E",5,25,true);

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));


        for (Candy candy : candies) {
            System.out.println(candy.getBrand()+ " : "+  candy.getPrice());
        }
        System.out.println(candy1);

    }
}
