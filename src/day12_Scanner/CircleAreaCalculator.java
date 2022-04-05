package day12_Scanner;
import java.util.Scanner;
public class CircleAreaCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = scan.nextDouble();

        double area = 3.14 * radius * radius ;
        System.out.println("Area of the circle is: " + area);

        scan.close();
    }
}
