package day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int numberOfZeros = Collections.frequency(list2, 0);
        list2.removeIf(p -> p == 0);
        for (int i = 0; i < numberOfZeros; i++) {
            list2.add(0);
        }
        System.out.println(list2);

        System.out.println("---------------------------------------");


        char[] characters = "ABCD123$%#@&456EFG!".toCharArray();
        ArrayList<String> letters = new ArrayList<>();
        ArrayList<String> digits = new ArrayList<>();
        ArrayList<String> specialChars = new ArrayList<>();

        for ( char each : characters) {
            if (Character.isLetter(each)){
                letters.add(each+"");
            }else if (Character.isDigit(each)){
                digits.add(each+"");
            }else {
                specialChars.add(each+"");
            }
        }
        System.out.println("specialChars = " + specialChars);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);






    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList

	2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]


	3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"

				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}

 */