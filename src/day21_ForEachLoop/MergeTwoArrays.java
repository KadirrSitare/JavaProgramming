package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int[] combined = new int[arr1.length + arr2.length];


       /* for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }
        for (int j = 0, i = arr1.length; j < arr2.length; j++, i++) {
            combined[i] = arr2[j];
        }
        System.out.println(Arrays.toString(combined));
        */

        //SECOND WAY:

        int merged [] = Arrays.copyOf(arr1, arr1.length + arr2.length);

        for (int i = 0, j= arr1.length; i < arr2.length; i++, j++) {
            merged [j] = arr2[i];
        }
        System.out.println(Arrays.toString(merged));

        //THIRD WAY:

        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

        String[] students = new String[group1.length + group2.length];  // 8

        int i = 0;
        for (String each : group1) { // Ali, Layan, Aysenur
            students[i++] = each;
        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));


        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

    }
}
/*
write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */