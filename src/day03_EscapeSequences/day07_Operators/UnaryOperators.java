package day03_EscapeSequences.day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = -14;
        int num2 = 15;

        System.out.println(num1 < 0);
        System.out.println(num2 < 0);

        int num3 = 25;
        ++num3; // pre increment: increase the value by 1 right away
        System.out.println(num3);

        --num3; // pre decrement: decrease the value by 1 right away
        System.out.println(num3);

        System.out.println("--------------------");
        int b = 100;
        System.out.println(++b); //pre increment: increase the value by 1 right away
        int c = 100;
        System.out.println(c++); /* post increment: first passes the current value,
        then increases the value by 1   */
        System.out.println(c); // 101

        System.out.println("--------------------");

        int x =  200;
        System.out.println( --x); //pre decrement: decrease the value by 1 right away

        int y = 200;
        System.out.println(y--); /*post decrement: first passes the current value,
        then decreases the value by 1 */
        System.out.println(y); //199

        System.out.println("--------------------");

        int z = 45;

        System.out.println(++z); //46
        System.out.println(z++); //46
        System.out.println(z); //47

        int q = 30;

        System.out.println(--q); //29
        System.out.println(q--); //29
        System.out.println(q); //28



    }
}
