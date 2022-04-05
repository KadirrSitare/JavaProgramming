package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 7;
        String day = "";

        switch (number) { //1,2,3,4,5,6,7
            case 1: //if the number == 1
                day = "Monday";
                break; //exits the switch after executing the case block
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default: //only gets executed if none of the case blocks are matching
                day = "Invalid day";
                //break; we don't need to give break statement to exit the switch because it is the last block
        }
        System.out.println(day);

    }
}
