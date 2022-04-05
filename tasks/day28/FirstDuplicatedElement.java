package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        for (Integer each : list) {
            int count = 0;
            int duplicated = each;
            for (Integer each2 : list) {
                if (duplicated==each2){
                    count++;
                }
            }
            if (count>=2){
                System.out.println(duplicated);
                break;
            }
        }



    }
}
/*
Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */