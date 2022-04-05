package day21;

import java.util.Arrays;

public class SortingArrayInDescendingOrder {

    public static void main(String[] args) {

        int [] numbers = {1,2,8,7,6,85};

        Arrays.sort(numbers);
        int [] reversed = new int[numbers.length];
        for (int i = numbers.length - 1, j=0; i >= 0; i--,j++) {
            reversed[i] = numbers[j];
        }
        System.out.println(Arrays.toString(reversed));



    }
}
/*
Write a program that sort the array of integer in descending order
 */