package week14.browserPagesInheritance;

public class AmazonHomePage extends Browser{

    public String product;
    public AmazonHomePage(String name) {
        super(name);
    }

    public void navigateTo(String link){
        //normally we will have selenium code but for right now we will just use println to understand inheritance
        System.out.println("Navigating to " + link+ " using " + super.getName());
    }

    public void shopFor(String product){
        this.product = product;
        System.out.println("Navigating to " + this.product + "'s page");
    }




}
