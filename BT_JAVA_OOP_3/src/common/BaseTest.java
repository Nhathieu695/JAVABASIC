package common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: "+ Constants.getBrowser());
        System.out.println("Report: "+ Constants.isReport());
        System.out.println("Headless: "+ Constants.isHeadless());
    }

    public void createDriver(String browser){
        System.out.println("Browser: "+ browser);
    }


    public void closeDriver(String browser){
        System.out.println("Browser: "+ browser);
    }

    public void closeDriver(){
        System.out.println("Browser: "+Constants.getBrowser() );
    }
}
