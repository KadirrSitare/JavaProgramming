package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int minNumber = 2147483647;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num < minNumber){
                minNumber = num;
            }

        }
        System.out.println("Min Number: " + minNumber);
        scan.close();
    }
}
