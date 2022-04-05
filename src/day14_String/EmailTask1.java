package day14_String;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.next();
        scan.close();

        if (email.contains("_")) {
            int index1 = email.indexOf("_");
            int index2 = email.lastIndexOf("@");
            String firstName = email.substring(0, index1);
            String lastName = email.substring(index1 + 1, index2);
            String service = email.substring(index2);
            System.out.println(lastName + "_" + firstName + service);
        } else {
            System.out.println(email);
        }
    }
}
/*
 Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */