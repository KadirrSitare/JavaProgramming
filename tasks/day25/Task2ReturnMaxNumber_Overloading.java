package day25;

public class Task2ReturnMaxNumber_Overloading {

    public static void main(String[] args) {

        double max= maxNumber(new double[] {2.5,5,1.2,4});
        System.out.println(max);

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

    public static double maxNumber (double [] numbers){

        double maxNumber = numbers[0];
        for (double each : numbers) {
            if (each>maxNumber){
                maxNumber= each;
            }
        }
        return maxNumber;
    }

    public static long maxNumber (long [] numbers){

        long maxNumber = numbers[0];
        for (long each : numbers) {
            if (each>maxNumber){
                maxNumber= each;
            }
        }
        return maxNumber;
    }

    public static short maxNumber (short [] numbers){

        short maxNumber = numbers[0];
        for (short each : numbers) {
            if (each>maxNumber){
                maxNumber= each;
            }
        }
        return maxNumber;
    }

    public static float maxNumber (float [] numbers){

        float maxNumber = numbers[0];
        for (float each : numbers) {
            if (each>maxNumber){
                maxNumber= each;
            }
        }
        return maxNumber;
    }

    public static byte maxNumber (byte [] numbers){

        byte maxNumber = numbers[0];
        for (byte each : numbers) {
            if (each>maxNumber){
                maxNumber= each;
            }
        }
        return maxNumber;
    }

}
/*
1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
 */