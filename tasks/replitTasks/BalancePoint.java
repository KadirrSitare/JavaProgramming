package replitTasks;

public class BalancePoint {

    public static void main(String[] args) {

        int[] array = {4, 9, 1, 3, 6, 4};

        int balanceIndex = balanceItemIndex(array);

        System.out.println(balanceIndex);

        /*int sum = 0;
        int balanced = 0;

        for (int each : array) {
            sum += each;
        }
        for (int i = 0; i < array.length; i++) {
            balanced += array[i];
            if ((balanced == (sum - array[i + 1]) / 2)) {
                System.out.println(i + 1);
                break;
            }

        }*/

    }


    public static int balanceItemIndex(int[] array) {

        int sum = 0;
        int balanced = 0;
        int i = 0;


        for (int each : array) {
            sum += each;
        }
        for (i = 0; i < array.length; i++) {
            balanced += array[i];
            if ((balanced == (sum - array[i + 1]) / 2)) {

                break;
            }
        }
        return i + 1;

    }

}
/*
Question 2: FindTheBalanceItemIndex

   //Given an array of integers, write a program that prints the index of an item
   //in the array, where the sum of all items on its left is equal to the sum
   //of the ones on the right.

   For example :
       Given array => [4, 9, 1, 3, 6, 4]
   //Output:
       your program should print as a result => 2
       because the item at index 2 is 1, and 4+9 = 3+6+4
 */