package core_Java.singleTOne;

public class SingletoneExample {

    private static SingletoneExample driver = null;

    private SingletoneExample(){
        System.out.println("SIngletone cosntructor");

    }

    public static SingletoneExample getInstance(){
        if(driver == null){
            driver = new SingletoneExample();
        }
        return driver;

    }

}
