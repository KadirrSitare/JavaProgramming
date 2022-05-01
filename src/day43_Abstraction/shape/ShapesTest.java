package day43_Abstraction.shape;

public class ShapesTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Square square   = new Square(4);
        Rectangle rectangle = new Rectangle(4,5);

        System.out.println(circle1.area());
        System.out.println(circle1.getRadius());
        System.out.println(circle1);
        System.out.println(circle1.perimeter());
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle1.getPi());
        System.out.println(Circle.getPi());


    }
}
