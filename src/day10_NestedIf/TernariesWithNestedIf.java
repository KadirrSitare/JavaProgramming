package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s= 500;

        String result = (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid score";

        System.out.println("result = " + result);


    }
}
