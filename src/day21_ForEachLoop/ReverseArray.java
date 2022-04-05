package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};
        int [] reverse = new int[nums.length];

        for (int i = nums.length - 1, j=0; i >= 0; i--,j++) {
            reverse[i]= nums[j];
        }
        System.out.println(Arrays.toString(reverse));


    }
}
