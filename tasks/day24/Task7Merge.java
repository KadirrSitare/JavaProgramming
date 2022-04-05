package day24;

import java.util.Arrays;

public class Task7Merge {

    public static void main(String[] args) {

int [] array3 = merge(new int[]{1,2,3}, new int[] {4,5,6});
        System.out.println(Arrays.toString(array3));

    }
    public static int [] merge(int[] array1, int[] array2){
        int [] merged = Arrays.copyOf(array1, array1.length+array2.length);
        int i=0;
        for (int each : array2) {
            merged [array1.length+i] = each;
            i++;
        }
        return merged;
    }


}
/*
Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */