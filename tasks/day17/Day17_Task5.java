package day17;

import java.util.Scanner;

public class Day17_Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to reserve a room? yes/no");
        String answer = scan.next().toLowerCase();
        String room = "";

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid answer. Would you like to reserve a room? yes/no ");
            answer = scan.next().toLowerCase();
        }
        if (answer.equals("no")) {
            System.out.println("Have a nice day");
        } else {
            System.out.println("Which type of room do you want to reserve? king/queen/single");
            room = scan.next().toLowerCase();
            while (!((room.equals("king") || room.equals("queen") || room.equals("single")))) {
                System.out.println("Invalid room, please reselect the room? king/queen/single");
                room = scan.next().toLowerCase();
            }
            if (room.equals("king")) {
                System.out.println("King Bed ==> 120$");
            } else if (room.equals("queen")) {
                System.out.println("Queen Bed ==> 100$");
            } else {
                System.out.println("Single Bed ==> 80$");
            }
        }
    }
}
/*
Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */