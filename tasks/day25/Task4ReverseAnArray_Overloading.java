package day25;

import java.util.Arrays;

public class Task4ReverseAnArray_Overloading {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int[] reversed = reversedArray(array);
        System.out.println(Arrays.toString(reversed));

    }
    public static int [] reversedArray(int[] array){

        int [] reversed = new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public static double [] reversedArray(double[] array){

        double [] reversed = new double[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public static char [] reversedArray(char[] array){

        char [] reversed = new char[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public static String [] reversedArray(String[] array){

        String [] reversed = new String[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

}
/*
1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */