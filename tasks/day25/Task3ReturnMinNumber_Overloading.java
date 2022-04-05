package day25;

public class Task3ReturnMinNumber_Overloading {

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

    public static double minNumber (double [] numbers){

        double minNumber = numbers[0];
        for (double each : numbers) {
            if (each<minNumber){
                minNumber= each;
            }
        }
        return minNumber;
    }

    public static long minNumber (long [] numbers){

        long minNumber = numbers[0];
        for (long each : numbers) {
            if (each<minNumber){
                minNumber= each;
            }
        }
        return minNumber;
    }

    public static short minNumber (short [] numbers){

        short minNumber = numbers[0];
        for (short each : numbers) {
            if (each<minNumber){
                minNumber= each;
            }
        }
        return minNumber;
    }

    public static float minNumber (float [] numbers){

        float minNumber = numbers[0];
        for (float each : numbers) {
            if (each<minNumber){
                minNumber= each;
            }
        }
        return minNumber;
    }

    public static byte minNumber (byte [] numbers){

        byte minNumber = numbers[0];
        for (byte each : numbers) {
            if (each<minNumber){
                minNumber= each;
            }
        }
        return minNumber;
    }
    
}
/*
1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array
 */