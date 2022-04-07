package day35.square;

import day35.square.Square;

public class SquareObjects {

    public static void main(String[] args) {

        Square square1 = new Square(3);
        System.out.println(square1);
        square1.setSide(10);
        System.out.println(square1);
        Square square2 = new Square(7);
        square2.setSide(-5);
        System.out.println(square2);
        System.out.println(square1);
        System.out.println(square1.getSide());

    }
}
