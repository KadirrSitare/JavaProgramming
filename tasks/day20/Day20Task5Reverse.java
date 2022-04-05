package day20;

import java.util.Arrays;

public class Day20Task5Reverse {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};
        int reversedArray[] = new int[nums.length];

        for (int j= 0, i = nums.length - 1; i >= 0; j++,i--) {

                reversedArray[j]= nums[i];
        }
        System.out.println(Arrays.toString(reversedArray));

    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */