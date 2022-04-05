package day24;

public class Task5FrequencyOfElement {

    public static void main(String[] args) {


        System.out.println(frequency(new int []{1,1,1,0,1,5,4,1,9}, 1));

    }
    public static int frequency(int[] array, int number){

        int freq = 0;
        for (int each : array) {
            if (number==each){
                freq++;
            }
        }
        return freq;
    }

}
/*
create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */