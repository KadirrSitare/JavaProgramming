package day08_IfStatement;

public class SwapTwoVariablesWithoutTemporaryVariable {
    public static void main(String[] args) {
        int a = 40;
        int b = 15;
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
