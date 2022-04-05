package day21;

public class CommonElements {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 8, 7, 6, 85};
        int[] numbers2 = {2, 8, 7, 11, 22, 44, 6};

        for (int number : numbers) {
            int count = 0;
            for (int each : numbers2) {
                if (number == each) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.print(number + " ");
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


          MUST use for each loops
 */