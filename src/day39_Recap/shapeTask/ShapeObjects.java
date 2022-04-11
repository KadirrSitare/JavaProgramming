package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square1 = new Square(5);

        System.out.println(square1);
        square1.setSide(10);
        System.out.println(square1.area());
        System.out.println(square1.perimeter());

        Circle circle1 = new Circle(5);
        System.out.println(circle1);

        circle1.setRadius(10);
        System.out.println(circle1.getRadius());





    }
}
