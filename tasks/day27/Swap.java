package day27;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        int[] swapped = swapElements(array, 0, 1);
        System.out.println(Arrays.toString(swapped));


    }

    public static int[] swapElements(int[] array, int index1, int index2) {

        int[] result = Arrays.copyOf(array, array.length);

        result[index1] = array[index2];
        result[index2] = array[index1];
        return result;

    }

    public static double[] swapElements(double[] array, int index1, int index2) {

        double[] result = Arrays.copyOf(array, array.length);

        result[index1] = array[index2];
        result[index2] = array[index1];
        return result;

    }

    public static char[] swapElements(char[] array, int index1, int index2) {

        char[] result = Arrays.copyOf(array, array.length);

        result[index1] = array[index2];
        result[index2] = array[index1];
        return result;

    }

    public static String[] swapElements(String[] array, int index1, int index2) {

        String[] result = Arrays.copyOf(array, array.length);

        result[index1] = array[index2];
        result[index2] = array[index1];
        return result;

    }

}
/*
Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */
