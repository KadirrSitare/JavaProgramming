package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 ={"D", "E", "F", "G"};
        ArrayList<String> arr3 = new ArrayList<>();
        for (String each : arr1) {
            arr3.add(each);
        }
        for (String each : arr2) {
            arr3.add(each);
        }
        System.out.println(arr3);
    }
}
/*
write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */