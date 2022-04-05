package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10 + 5); // 15
        System.out.println("12" + 1); // 121 , concatenation
        System.out.println(100 - 40); // 60
        System.out.println( 5 * 6); // 30

        System.out.println( 100 / 3); // 33 if both numerator and denumerator are integers result is integer
        System.out.println( 10.0 / 4); //2.5 if one of them is decimal, the return will be decimal.
        System.out.println(10d / 4); //2.5   d after an integer converts it into decimal number


        int a = 100;
        double b = a/6; //16.0 // returns an integer result first and then casts into a double type
        System.out.println(b);

        double c = a / 6d; //16.6666666
        double d = (double)a / 6; //16.66666
        System.out.println(c);
        System.out.println(d);



    }
    /* integer / integer =====> integer
   decimal / integer =====> decimal
    integer / decimal =====> decimal
    decimal / decimal =====> decimal
    */



}
