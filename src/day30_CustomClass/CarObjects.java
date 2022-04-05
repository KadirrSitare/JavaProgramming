package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setInfo("Honda", "Civic", "Grey", 2021, 45000);
        car2.setInfo("Nissan", "Juke", "Black", 2020, 37500);
        car3.setInfo("Opel", "Corsa", "Red", 2018, 28000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Car [] cars = {car1, car2, car3};

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : carsList) {
            System.out.println(each.brand + " : " + each.price);
        }

        /*recall :
        Honda : 2005~2008
        Nissan : 1995~1997

         */
        carsList.removeIf(p -> p.brand.equals("Honda") && p.year>=2005 && p.year<=2008);
        carsList.removeIf(p -> p.brand.equals("Nissan") && p.year>=1995 && p.year<=1997);



    }
}
