package day43_Abstraction.shape;

public class Rectangle extends Shape{

     private double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            throw new RuntimeException("Invalid width: "+ width);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            throw new RuntimeException("Invalid length: "+ length);
        }
        this.length = length;
    }

    public double area() {
        return getLength()*getWidth();
    }

    public double perimeter() {
        return 2*(getLength()+getWidth());
    }

    public String toString() {
        return "Shape{" +
                "name='" + getName() + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
