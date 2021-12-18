package core_Java.singleTOne;

public class Webdrivers {

    static Webdrivers driver = null;

    private Webdrivers(){
        System.out.println("singleton constructor");
    }

    public static Webdrivers getInstance(){
        if(driver == null){
            Webdrivers driver = new Webdrivers();
        }
        return driver;
    }

}
