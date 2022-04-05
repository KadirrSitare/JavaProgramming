package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter true or false:");
       // boolean result = scan.nextBoolean(); //only true or false can be entered
        System.out.println("Enter your name: ");
        String name = scan.next(); //reads the input until a space
        scan.close();
        System.out.println(name);


    }
}
