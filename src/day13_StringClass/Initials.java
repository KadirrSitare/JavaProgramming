package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first = scan.nextLine();
        System.out.println("Enter your last name:");
        String last = scan.nextLine();
        scan.close();

        String initial1 = first.toUpperCase();
        String initial2 = last.toUpperCase();

        System.out.println(initial1.charAt(0) + "." + initial2.charAt(0));
    }
}
/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */