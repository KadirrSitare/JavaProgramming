package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b = a; // implicit casting
        //short b = (short)a
        int c = (int) b;
        long d = c; // (long)c
        long s = 6665448155454545L;
        short z = (short) s;
        System.out.println(s + " = " + z);
        double l = 2.5;
        float m = (float) l;
        System.out.println(l + " = " + m);
        double n = 10.8;
        int o = (int) n; // Alt + Enter la manually explicit casting yapmayi unutursan boyle yapabilirsin
        System.out.println(n + " = " + o);
    }


}
