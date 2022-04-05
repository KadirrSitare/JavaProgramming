package day27;

import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,9,10,11};
        System.out.println(Arrays.toString(InsertElement(array, 7,8)));

    }

    public static int[] InsertElement(int[] array, int index, int element){

        int[] result = new int[array.length +1];

        if(index < 0 || index > result.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int j = 0;
        for (int i= 0; i < array.length; i++) {

            if (i<index){
                result[j++] = array[i];
            } else if(i == index){  // if the index of array is matching with the given index
                result[j++] = element;
                break;
            }

        }
        for (int i = j; i < result.length; i++,j++) {
            result [j] = array [j-1];
        }
        
        return result;
    }

    public static double[] InsertElement(double[] array, int index, double element){

        double[] result = new double[array.length +1];

        if(index < 0 || index > result.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int j = 0;
        for (int i= 0; i < array.length; i++) {

            if (i<index){
                result[j++] = array[i];
            } else if(i == index){  // if the index of array is matching with the given index
                result[j++] = element;
                break;
            }

        }
        for (int i = j; i < result.length; i++,j++) {
            result [j] = array [j-1];
        }

        return result;
    }

    public static char[] InsertElement(char[] array, int index, char element){

        char[] result = new char[array.length +1];

        if(index < 0 || index > result.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int j = 0;
        for (int i= 0; i < array.length; i++) {

            if (i<index){
                result[j++] = array[i];
            } else if(i == index){  // if the index of array is matching with the given index
                result[j++] = element;
                break;
            }

        }
        for (int i = j; i < result.length; i++,j++) {
            result [j] = array [j-1];
        }

        return result;
    }

    public static String[] InsertElement(String[] array, int index, String element){

        String[] result = new String[array.length +1];

        if(index < 0 || index > result.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int j = 0;
        for (int i= 0; i < array.length; i++) {

            if (i<index){
                result[j++] = array[i];
            } else if(i == index){  // if the index of array is matching with the given index
                result[j++] = element;
                break;
            }

        }
        for (int i = j; i < result.length; i++,j++) {
            result [j] = array [j-1];
        }

        return result;
    }

}
/*
Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */