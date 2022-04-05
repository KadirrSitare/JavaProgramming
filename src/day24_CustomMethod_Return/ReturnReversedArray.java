package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReturnReversedArray {

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


}
/*
create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
 */