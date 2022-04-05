package day24_CustomMethod_Return;

public class ReturnMinNumber {

    public static void main(String[] args) {

        int [] array = {100,10,5,8};
        int minNumber = minNumber(array);

        System.out.println(minNumber);

    }
    public static int minNumber (int [] numbers){

        int minNumber = numbers[0];
        for (int each : numbers) {
            if (each<minNumber){
                minNumber= each;
            }
        }
        return minNumber;
    }

}
/*
 create a method that can return the minimum number from an array of integers
 */