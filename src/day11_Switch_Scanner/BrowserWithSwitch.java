package day11_Switch_Scanner;

public class BrowserWithSwitch {

    public static void main(String[] args) {

        String browserName = "gtgrg";

        switch (browserName) {
            case "chrome":
                System.out.println("Selected browser is chrome");
                break;
            case "opera":
                System.out.println("Selected browser is opera");
                break;
            case "safari":
                System.out.println("Selected browser is safari");
                break;
            case "firefox":
                System.out.println("Selected browser is firefox");
                break;
            case "edge":
                System.out.println("Selected browser is edge");
                break;
            default:
                System.out.println("Invalid Browser");
        }

    }
}
/*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser
            Do Not use if statement or ternary
 */