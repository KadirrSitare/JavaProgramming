package day20;

import java.util.Arrays;

public class Day20Task6MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int nums[] = {10, 0, 5, 0, 1, 0};

        /*Arrays.sort(nums);

        int reversed [] = new int[nums.length];
        for (int i = nums.length-1, j=0; i >= 0; i--,j++) {
            reversed[j] = nums[i];
            }*/
        int j = 0;
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */