package day37_Inheritance.phoneTask;

import java.util.Arrays;

public class PhoneObjects {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone("14","white",'M', 780);
        Samsung samsung = new Samsung("Galaxy Note 20","purple" , 'M', 900 );
        Nokia nokia = new Nokia("9333", "black",'S' ,100);

        System.out.println(Arrays.asList(samsung,nokia,iPhone));

        System.out.println(samsung);
        iPhone.faceTime("gmail");
        nokia.selfDefence();
        System.out.println(iPhone);
        nokia.text(905054444);
        iPhone.call(911);
        samsung.freeze();
    }


}
