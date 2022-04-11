package day39_Recap.shapeTask;

public class Circle extends Shape {

    private double radius;
    public static double pi;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("Invalid radius: "+  radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    static {
        pi = 3.14;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2* pi * radius ;
    }

    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", pi= " + pi +
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }
}
