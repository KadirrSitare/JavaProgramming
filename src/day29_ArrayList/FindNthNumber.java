package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindNthNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7, 7,8, 8));

        int n = 5;
        int max = 0;
        for (int i = 1; i < n; i++) {
            max = Collections.max(list);
            list.removeAll(Arrays.asList(max));
        }
        System.out.println(Collections.max(list));

    }
}
/*
write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4
 */