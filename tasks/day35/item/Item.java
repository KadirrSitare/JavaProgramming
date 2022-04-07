package day35.item;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()|| name.isBlank()){
            System.err.println("Invalid entry. Name CANNOT be empty or blank.");
            System.exit(1);
        }
        char [] chars = name.toCharArray();
        for (char ch : chars) {
            if (!((ch>=65 && ch <=90) || (ch>=97 && ch <=122) || (ch>=48 && ch <=57) || (ch == ' '))){
                System.err.println("Invalid entry. Name CANNOT contain special characters.");
                System.exit(1);
            }
        }
        if (name.startsWith(" ")){
            System.err.println("Invalid entry. Name MUST start with a letter.");
            System.exit(1);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0){
            System.err.println("Invalid Unit price:" + unitPrice);
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            System.err.println("Invalid quantity:" + quantity);
            System.exit(1);
        }
        if (name.equalsIgnoreCase("toilet paper") && quantity>1){
            System.err.println("Toilet paper quantity CANNOT be more than 1");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity*unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total cost= $" + calcCost() +
                '}';
    }
}
/*
 Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */