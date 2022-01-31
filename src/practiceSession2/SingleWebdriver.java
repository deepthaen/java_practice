package practiceSession2;

public class SingleWebdriver {

    public static SingleWebdriver driver = null;

    private SingleWebdriver(){
        System.out.println("SIngletone constructor");
    }

    public static SingleWebdriver getInstance(){
        if(driver == null){
            driver = new SingleWebdriver();
        }

        return driver;
    }


}
