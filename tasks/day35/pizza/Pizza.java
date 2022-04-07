package day35.pizza;

public class Pizza {

    private String size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!(size.equalsIgnoreCase("small")|| size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large"))){
            System.err.println("Invalid size: " + size);
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        if((size.equalsIgnoreCase("small")) && ((numberOfCheeseToppings<0) || (numberOfCheeseToppings>3))){
            System.err.println("Invalid numberOfCheeseToppings: " + numberOfCheeseToppings);
            System.exit(1);
        }else if((size.equalsIgnoreCase("medium")) && ((numberOfCheeseToppings<0) || (numberOfCheeseToppings>4))){
            System.err.println("Invalid numberOfCheeseToppings: " + numberOfCheeseToppings);
            System.exit(1);
        }else if((size.equalsIgnoreCase("large")) && ((numberOfCheeseToppings<0) || (numberOfCheeseToppings>5))){
            System.err.println("Invalid numberOfCheeseToppings: " + numberOfCheeseToppings);
            System.exit(1);
        }
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        if((size.equalsIgnoreCase("small")) && ((numberOfPepperoniToppings<0) || (numberOfPepperoniToppings>4))){
            System.err.println("Invalid numberOfPepperoniToppings: " + numberOfPepperoniToppings);
            System.exit(1);
        }else if((size.equalsIgnoreCase("medium")) && ((numberOfPepperoniToppings<0) || (numberOfPepperoniToppings>5))){
            System.err.println("Invalid numberOfPepperoniToppings: " + numberOfPepperoniToppings);
            System.exit(1);
        }else if((size.equalsIgnoreCase("large")) && ((numberOfPepperoniToppings<0) || (numberOfPepperoniToppings>6))){
            System.err.println("Invalid numberOfPepperoniToppings: " + numberOfPepperoniToppings);
            System.exit(1);
        }
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost(){

        double totalCost = 10 + 2*(numberOfCheeseToppings+numberOfPepperoniToppings);
        if (size.equalsIgnoreCase("medium")){
            totalCost +=2;
        }else if (size.equalsIgnoreCase("large")){
            totalCost +=4;
        }
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", Total cost= $" + calcCost() +
                '}';
    }
}
/*
Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping



 */