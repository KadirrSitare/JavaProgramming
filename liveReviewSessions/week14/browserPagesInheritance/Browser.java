package week14.browserPagesInheritance;

public class Browser {

    private static String browserType; //chrome, safari, edge, firefox...

    private static String operatingSystem; //windows, android, IOS...


    public Browser(String name) {
        browserType = name;
    }


    static{
        operatingSystem = "Windows";
    }

    public String getName() {
        return browserType;
    }

    public void closeBrowser(){ //this method is created so we can use before setting a new one
        browserType=null;
    }

    public void setName(String name){ //our setter method checks if there is already an open browser type before setting a new one
        if (browserType==null)
        browserType = name;
        else
            System.out.println("There is already an open browser: "+ browserType);
        //only sets a new one if there is no browser assigned
    }

    public static String getOperatingSystem(){
        return operatingSystem;
    }

}
