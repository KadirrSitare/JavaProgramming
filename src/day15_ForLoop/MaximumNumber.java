package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int maxNumber = -2147483648;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num > maxNumber){
                maxNumber = num;
            }

        }
        System.out.println("Max Number: " + maxNumber);
        scan.close();
    }
}
