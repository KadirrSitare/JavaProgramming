package day24;

import java.util.Arrays;

public class Task6AddElement {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        int [] elementAddedArray = addElement(array,4);
        System.out.println(Arrays.toString(elementAddedArray));


    }
    public static int[] addElement(int[]array, int number){

        int [] newArray = Arrays.copyOf(array,array.length+1);
        newArray[array.length]= number;
        return newArray;
    }



}
/*
create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */