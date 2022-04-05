package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5,6};
        int[] arr3 = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int[] merged = Arrays.copyOf(array1,array1.length + array2.length );
        int i = 0;
        for (int each : array2) {
            merged[array1.length + i] = each;
            i++;
        }
        return merged;
    }

}
/*
create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}
 */