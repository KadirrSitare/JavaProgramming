package day24;

import java.util.Arrays;

public class Task10RemoveElement {

    public static void main(String[] args) {

        int [] array = {10,20,30,40,50};
        int [] removed = removeElement(array, 1);
        System.out.println(Arrays.toString(removed));

    }

    public static int[] removeElement(int[] array, int index) {

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] removed = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i <index){
                removed [i] = array[i];
            }else if (i>index){
                removed[i-1]= array[i];
            }
        }
        return removed;

    }

}
/*
create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */