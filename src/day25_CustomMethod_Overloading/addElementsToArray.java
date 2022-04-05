package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class addElementsToArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        array = addInteger(array, 4);
        System.out.println(Arrays.toString(array));

        double[] array2 = {1, 2, 3};
        array2 = addDouble(array2, 4.5);
        System.out.println(Arrays.toString(array2));

        String[] array3 = {"ali", "veli", "deli"};
        array3 = addString(array3, "really");
        System.out.println(Arrays.toString(array3));

        char[] array4 = {'j', 'a', 'v'};
        array4 = addChar(array4, 'a');
        System.out.println(Arrays.toString(array4));


    }

    public static int[] addInteger(int[] array, int element) {

        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }

    public static double[] addDouble(double[] array, double element) {

        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }

    public static String[] addString(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    public static char[] addChar(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


}
/*
1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

 */