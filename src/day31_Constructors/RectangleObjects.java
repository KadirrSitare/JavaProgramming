package day31_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10,5.6);
        Rectangle rectangle2 = new Rectangle(4,3.5);


        double perimeter = rectangle1.calculatePerimeter();

        double area = rectangle1.calculateArea();
        System.out.println("rectangle1 = " + rectangle1);
        System.out.println("rectangle2 = " + rectangle2);




    }
}
