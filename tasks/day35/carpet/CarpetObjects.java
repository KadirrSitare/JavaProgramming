package day35.carpet;

import day35.carpet.Carpet;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(5, 10, 2, true);
        System.out.println(carpet1);
        carpet1.setPersian(false);
        System.out.println(carpet1);
        carpet1.setUnitPrice(10);
        System.out.println(carpet1);

    }
}
