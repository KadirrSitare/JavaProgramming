package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPepperonitopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperonitopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperonitopping = numberOfPepperonitopping;
    }

    public double calcCost() {
        double cost = 0;

        if (size == 'S') {
            cost = 10 + (numberOfCheeseTopping + numberOfPepperonitopping) * 2;
        } else if (size == 'M') {
            cost = 12 + (numberOfCheeseTopping + numberOfPepperonitopping) * 2;
        } else if (size == 'L'){
            cost = 14 + (numberOfCheeseTopping + numberOfPepperonitopping) * 2;
        }else {
            System.out.println("Incorrect size!");
            System.exit(0);
        }
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperonitopping=" + numberOfPepperonitopping + ", cost= $" +calcCost()
                + '}';
    }
}
/*
Pizza Task:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */