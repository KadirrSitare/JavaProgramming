package day11_Switch_Scanner;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 5;
        String info = "";

        if (floorNumber == 1 || floorNumber == 2 || floorNumber == 3) {
            if (floorNumber == 1) {
                info = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                info = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            } else {
                info = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        } else {
            info = "Invalid floor - " + floorNumber;
        }
        System.out.println(info);
        System.out.println("------------------------------");

        switch (floorNumber) {
            case 1:
                info = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                info = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                info = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                info = "Invalid floor - " + floorNumber;
        }
        System.out.println(info);
        System.out.println("----------------------");

        if (floorNumber == 1 || floorNumber == 2 || floorNumber == 3) {
            switch (floorNumber) {
                case 1:
                    info = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    info = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                case 3:
                    info = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        } else {
            info = "Invalid floor - " + floorNumber;
        }
        System.out.println(info);

    }
}
/*

	2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */