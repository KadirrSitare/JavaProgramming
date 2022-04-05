package day18;

import java.util.Scanner;

public class Day18_Task2_RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;
        String yesNo = "";
        while (true) {
            System.out.println("Which bedroom do you want to reserve? King/Queen/Single");
            String answer1 = scan.next().toLowerCase();
            while (!(answer1.equals("king") || answer1.equals("queen") || answer1.equals("single"))){
                System.out.println("Invalid answer. Which bedroom do you want to reserve? King/Queen/Single");
                answer1 = scan.next().toLowerCase();
            }
            System.out.println("How many nights do you want to stay?");
            int nights = scan.nextInt();
            total += (answer1.equals("king")) ? nights * 120 : (answer1.equals("queen")) ? nights * 100 : nights * 80;

            System.out.println("Would you like to reserve another room?yes/no");
            yesNo = scan.next().toLowerCase();
            while (!(yesNo.equals("yes") || yesNo.equals("no"))){
                System.out.println("Invalid answer. Would you like to reserve another room?yes/no");
                yesNo = scan.next().toLowerCase();
            }
            if (yesNo.equals("no")) {
                break;
            }
        }
        System.out.println("Your total price is $" + total);
        scan.close();
    }
}
/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */