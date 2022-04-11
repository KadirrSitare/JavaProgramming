package day38.browser;

public class Test {

    public static void main(String[] args) {

        Opera opera = new Opera();
        Safari safari = new Safari();
        Firefox firefox = new Firefox();
        Chrome chrome = new Chrome();

        opera.openBrowser();
        opera.closeBrowser();
        safari.openBrowser();
        safari.closeBrowser();
        firefox.openBrowser();
        firefox.closeBrowser();
        chrome.openBrowser();
        chrome.closeBrowser();


    }
}
