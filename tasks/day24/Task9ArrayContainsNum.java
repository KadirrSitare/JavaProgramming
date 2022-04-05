package day24;

public class Task9ArrayContainsNum {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        boolean isContained = contains(array, 1);
        System.out.println(isContained);

    }

    public static boolean contains(int[] array, int number) {

        boolean isContained = false;
        for (int each : array) {
            if (each == number) {
                isContained = true;
                break;
            }
        }
        return isContained;
    }

}
/*
Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */