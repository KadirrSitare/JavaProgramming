package day25;

import java.util.Arrays;

public class Task1MergeArrays_Overloading {

    public static void main(String[] args) {
        
        String [] str1 = {"ali", "veli"};
        String [] str2 = { "49", "50"};
        String [] merged = mergeArrays(str1,str2);
        System.out.println(Arrays.toString(merged));
        
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

    public static double[] mergeArrays(double[] array1, double[] array2) {

        double[] merged = Arrays.copyOf(array1,array1.length + array2.length );
        int i = 0;
        for (double each : array2) {
            merged[array1.length + i] = each;
            i++;
        }
        return merged;
    }

    public static char[] mergeArrays(char[] array1, char[] array2) {

        char[] merged = Arrays.copyOf(array1,array1.length + array2.length );
        int i = 0;
        for (char each : array2) {
            merged[array1.length + i] = each;
            i++;
        }
        return merged;
    }

    public static String[] mergeArrays(String[] array1, String[] array2) {

        String[] merged = Arrays.copyOf(array1,array1.length + array2.length );
        int i = 0;
        for (String each : array2) {
            merged[array1.length + i] = each;
            i++;
        }
        return merged;
    }
}
/*

	1. create a method that can merge two integer arrays.  		

	2. create a method that can merge two double arrays.  	

	3. create a method that can merge two char arrays.   		

	4. create a method that can merge two String arrays.  
 */