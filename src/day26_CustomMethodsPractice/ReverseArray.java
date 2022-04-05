package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        double[] array = {10.5, 20, 30, 40, 50};
        array = reverse(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] reverse(int[] array) {

        int[] result = {};
        for (int i = array.length-1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    public static double[] reverse(double[] array) {

        double[] result = {};
        for (int i = array.length-1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    public static char[] reverse(char[] array) {

        char[] result = {};
        for (int i = array.length-1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    public static String[] reverse(String[] array) {

        String[] result = {};
        for (int i = array.length-1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }
}
