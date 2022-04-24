package week14.browserPagesInheritance;

public class TestCase {

    public static void main(String[] args) {

        AmazonHomePage amazonHomePage = new AmazonHomePage("Chrome");

        System.out.println("I am automating : "+  amazonHomePage.getName());
        System.out.println("My operating system is: " + Browser.getOperatingSystem());

        amazonHomePage.navigateTo("www.amazon.com");
        amazonHomePage.navigateTo("Search for laptops");
        amazonHomePage.shopFor("Samsung PC");

        ProductPage productObject = new ProductPage("Chrome", 2);
        String product = amazonHomePage.product;
        productObject.shopFor(product);

        amazonHomePage.navigateTo("Cart");

        CartPage cartPage = new CartPage("Chrome", "Mike Smith");
        cartPage.fillInfo();
        cartPage.payFor(4512458798543652L);

        cartPage.setName("Firefox");

        cartPage.closeBrowser();

        cartPage.setName("Firefox");
        System.out.println("I am automating: " + cartPage.getName());
        System.out.println("I am automating: " + amazonHomePage.getName());




    }
}
