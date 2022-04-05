package day24_CustomMethod_Return;

public class ReturnMaxNumber {

    public static void main(String[] args) {

        int [] array = {1,10,5,8};
        int maxNumber = maxNumber(array);

        System.out.println(maxNumber);

    }
    public static int maxNumber (int [] numbers){

       int maxNumber = numbers[0];
        for (int each : numbers) {
            if (each>maxNumber){
                maxNumber= each;
            }
        }
        return maxNumber;
    }

}
/*
create a method that can return the maximum number from an array of integers
 */