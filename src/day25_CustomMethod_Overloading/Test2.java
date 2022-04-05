package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        ArraysUtility.printEachElement(array);

        String[] array2 = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        ArraysUtility.printEachElement(array2);

        double [] array3 = {1.5, 2.6, 3.7, 4};
        ArraysUtility.printEachElement(array3);

        char[] array4 = {'A', 'B', 'F', 'T'};
        ArraysUtility.printEachElement(array4);

        int[] n1 = {1, 22, 35, 4};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        double[] n2 = {1.5, 22.4, 35.7, 4};
        double max2 = ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("---------------------------");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1, 5);

        System.out.println("r1 = " + r1);

        System.out.println("---------------------------");

        int[] a2 = {1,2,3,6,5,6,6};

        int freq = ArraysUtility.frequencyOfElement(a2, 6);

        System.out.println("freq = " + freq);

    }
}
