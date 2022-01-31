package practiceSession2;

public class SingleTneWebdriver {

    private static SingleTneWebdriver driver = null;

    private SingleTneWebdriver(){
        System.out.println("constructor singleton");
    }

    public static SingleTneWebdriver getInstance(){
        if(driver == null){
            driver = new SingleTneWebdriver();
        }

        return driver;
    }
}
