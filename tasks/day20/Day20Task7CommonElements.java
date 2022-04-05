package day20;

public class Day20Task7CommonElements {

    public static void main(String[] args) {

        int list1[] = {1, 2, 3, 4, 5};
        int list2[] = {4, 5, 6, 7, 8};


        for (int i = 0; i < list1.length; i++) {
            int i1 = list1[i];
            for (int j = 0; j < list2.length; j++) {
                int i2 = list2[j];
                if (i1 == i2) {
                    System.out.print(i1 + " ");
                }
            }
        }
    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */