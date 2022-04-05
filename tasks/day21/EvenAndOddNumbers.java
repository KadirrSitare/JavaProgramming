package day21;

import javax.lang.model.SourceVersion;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        int [] numbers = {1,3,5,7,8,6,4,2,9};
        int odds =0;
        int evens = 0;

        for (int each : numbers) {
            if (each%2 == 0){
                evens +=1;
            }else {
                odds +=1;
            }
        }
        System.out.println("evens = " + evens);
        System.out.println("odds = " + odds);

    }
}
/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */