package core_Java.singleTOne;

public class SingleToneWebdriver {

    static SingleToneWebdriver driver = null;

    private SingleToneWebdriver() {
        System.out.println("singletone construcotr");
    }

    public static SingleToneWebdriver getInstance() {
        if (driver == null) {
            SingleToneWebdriver driver = new SingleToneWebdriver();
        }
        return driver;
    }


    public static void main(String[] args) {
        SingleToneWebdriver s = SingleToneWebdriver.getInstance();
    }

}