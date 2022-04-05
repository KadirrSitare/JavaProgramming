package day15_ForLoop;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0){
                sum  += i;
            }
        }
        System.out.println(sum);
        System.out.println("--------------------------");
        int sum2 = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 1){
                sum2  += i;
            }
        }
        System.out.println(sum2);

    }
}
/*
Write a program that can return the sum of even numbers between 1 to 100
Write a program that can return the sum of odd numbers between 1 to 100
 */
