package day24;

import java.util.Arrays;

public class Task8ReverseArray {

    public static void main(String[] args) {

        int [] array = {1,2,3,4};
        int [] arrayReversed = reverseArray(array);
        System.out.println(Arrays.toString(arrayReversed));

    }

    public static int[] reverseArray(int[] array) {

        int[] reversed = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }


}
/*
Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */