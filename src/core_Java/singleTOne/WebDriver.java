package core_Java.singleTOne;

public class WebDriver {

    static WebDriver driver = null;

    private WebDriver(){
        System.out.println("Running Constructor Webdrivber");
    }

    public static  WebDriver getNew(){
        if(driver == null){
            driver = new WebDriver();
        }
        return driver;
    }

    public static WebDriver getold(){
        driver = new WebDriver();
        return driver;
    }

    public static void main(String[] args) {
        driver = getold();
        driver = getold();


        driver = getNew();
        driver = getNew();
        driver = getNew();
        driver = getNew();driver = getNew();
        driver = getNew();
        driver = getNew();
        driver = getNew();
        driver = getNew();driver = getNew();driver = getNew();




    }

}
