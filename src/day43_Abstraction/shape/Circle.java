package day43_Abstraction.shape;

public class Circle extends Shape{

    private double radius;
    private static double pi;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public static double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid radius: "+ radius);
        }
        this.radius = radius;
    }

    static{
        pi = 3.14;
    }


    public double area() {
        return getPi()* radius*radius;
    }

    public double perimeter() {
        return 2*getRadius()*getPi();
    }

    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", radius=" + radius +
                ", pi=" + pi +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
