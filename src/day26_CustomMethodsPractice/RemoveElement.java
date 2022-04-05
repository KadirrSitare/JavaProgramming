package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5,6,7};
        int [] removed1 = removeElement(a1,2);
        System.out.println(Arrays.toString(removed1));

        String[] array2 = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        String [] removed2 = removeElement(array2, 0);
        System.out.println(Arrays.toString(removed2));
    }

    public static int[] removeElement2(int[] array, int element){

        int [] removed = new int[array.length-1];
        int i=0;
        int j=0;
        for (int each : array) {
            if (array[i]!=element){
                removed[j++] = array[i++];
        }else {
                i++;
            }
        }
        return removed;
    }

    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int [] result = new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                result [j++] = array[i];
            }
        }

        return result;
    }

    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double [] result = new double[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                result [j++] = array[i];
            }
        }

        return result;
    }

    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char [] result = new char[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                result [j++] = array[i];
            }
        }

        return result;
    }

    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String [] result = new String[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                result [j++] = array[i];
            }
        }

        return result;
    }

}
/*
 Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */