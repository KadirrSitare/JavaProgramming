package day23;

public class EachElement {

    public static void main(String[] args) {


        //int[] array = {1, 3, 9};
        printEachElement(new int [] {1, 3, 9});

    }

    public static void printEachElement(int[] array) {

        for (int each : array) {
            System.out.println(each);
        }

    }


}
//create a method named printEachElement that can print each elements of an integer array