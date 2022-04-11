package day38.browser;

public class Firefox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing firefox browser");
    }
}
