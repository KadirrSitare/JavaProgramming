package day23;

public class PrintEvenNumbers1to100 {

    public static void main(String[] args) {

        printEvenNumbers1To100();


    }

    public static void printEvenNumbers1To100(){

        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+ " ");
        }
    }


}
//create a method that can print even numbers between 1~100 in a same line saperated by space