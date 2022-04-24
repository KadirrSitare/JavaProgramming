package week14.browserPagesInheritance;

public class ProductPage extends AmazonHomePage{

    public int quantity;

    public ProductPage(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }

    @Override //annotation should be applicable to the method
    public void shopFor(String product) {
        super.product = product;
        System.out.println("Automating "+ getName());
        System.out.println("Adding "+ quantity + " amount of " + product);
    }
}
