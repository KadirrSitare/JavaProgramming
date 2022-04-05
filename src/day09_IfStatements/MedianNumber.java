package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 30,
            b = 40,
            c = 20;
        boolean medianA = (b > a && a > c) || (c > a && a > b),
                medianB = (a > b && a > c) || (c > b && b > a),
                medianC = (a > c && a > b) || (b > c && c > a); // medianC = !medianA && !medianB;

        if(medianA){
            System.out.println( a + " is the median number");
        }
        if(medianB){
            System.out.println( b + " is the median number");
        }
        if(medianC){
            System.out.println( c + " is the median number");
        }

    }

}
   /* Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

        Ex:
        a = 10, b= 15, c = 20;

        Output:
        15 is the median number


        Posibility #1: a could be median number
        Posibility #2: b could be median number
        Posibility #3: c could be median number
    */