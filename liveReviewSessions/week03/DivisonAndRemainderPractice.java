package week03;

import java.util.Scanner;

public class DivisonAndRemainderPractice {

    public static void main(String[] args) {

        //input is in seconds
        //output should be in hours:minutes:seconds format
        int inputSeconds;
        int hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the seconds you want to convert");
        inputSeconds = scan.nextInt();
        seconds = inputSeconds % 60;
        minutes = (inputSeconds / 60) % 60;
        hours = inputSeconds / 3600;

        String clock = "Hours: " + hours + " Minutes:" + minutes + " Seconds:" + seconds;
        System.out.println("clock = " + clock);

    }
}
