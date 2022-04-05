package replitTasks;

import java.util.Arrays;

public class ShiftNumbersInArray {

    public static void main(String[] args) {

        int array[] = {6, 2, 5, 3};

        int modified[] = new int[array.length];

        modified[array.length - 1] = array[0];

        for (int i = 0; i < modified.length - 1; i++) {
            modified[i] = array[i + 1];
        }
        System.out.println(Arrays.toString(modified));

    }
}
/*
SECOND WAY:
        int[] arr= {6, 2, 5, 3,7,9};
        int[] arr2= new int[arr.length];
        int shift =3;

        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[shift++];
            if (shift==arr.length) shift=0;
        }

        System.out.println(Arrays.toString(arr2));
 */

/* **Q2- Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
 You may modify and print the given array, or print a new array.
 Example:

 input: 6, 2, 5, 3

 output: [2, 5, 3, 6]
 */
