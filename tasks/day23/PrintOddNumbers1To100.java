package day23;

public class PrintOddNumbers1To100 {

    public static void main(String[] args) {

        printOddNumbers1to100();

    }

    public static void printOddNumbers1to100() {

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i+ " ");

        }

    }


}
//create a method that can print odd numbers between 1~100 in a same line saperated by space