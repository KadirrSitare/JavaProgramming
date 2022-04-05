package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your programming language:");
        String lang = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt(); //24
        scan.nextLine(); //for capturing the Enter key hit after 24
        System.out.println("Enter your school name:");
        String schoolName = scan.nextLine();
        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("lang = " + lang);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

    }
}
