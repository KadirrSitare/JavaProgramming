package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice) {
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public void drive() {
        System.out.println(brand + " " + model + " " + year + " is driving");
    }

    public void start() {
        System.out.println(brand + " " + model + " " + year + " started");
    }

    public void stop() {
        System.out.println(brand + " " + model + " " + year + " stopped");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
/*
Car Car:

	Attributes:
		brand, model, color, year, price

	Actions:
		drive(), start(), stop(), toString(), setInfo()
 */