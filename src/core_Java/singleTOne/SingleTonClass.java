package core_Java.singleTOne;

public class SingleTonClass {

    static SingleTonClass singleTonRef=null;

    public static SingleTonClass getInstance(){
        if(singleTonRef==null){
            singleTonRef = new SingleTonClass();
        }
        return singleTonRef;
    }


    public static  void normalObject(){
        SingleTonClass s = new SingleTonClass();

    }

    /**
     *
     * WebDriver driver = new ChromerDriver();
     *
     * WebDriver driver = new ChromerDriver();
     *
     *
     * do like this below
     *
     * WebDriver driver = new ChromerDriver();
     *
     * if(driver==null){
     *     driver = new ChromeDriver();
     * }
     *
     */


}
