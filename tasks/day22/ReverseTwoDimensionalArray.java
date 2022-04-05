package day22;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = new int[array.length][];

        for (int i = 0; i < array.length; i++) {
            int temp[] = new int[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                temp[(temp.length - 1) - j] = array[i][j];
            }
            result[(array.length - 1) - i] = temp;
        }
        System.out.println(Arrays.deepToString(result));


    }
}
/*
Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */