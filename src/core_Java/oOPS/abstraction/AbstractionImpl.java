package core_Java.oOPS.abstraction;

public class AbstractionImpl implements Interface_1{
    @Override
    public void car() {
        System.out.println("car running");
    }

    @Override
    public String engine() {

        String s = "Petrol";
        System.out.println("engine petrol"+s);
        return s;
    }

    @Override
    public String model(String engine) {
        System.out.println("A4 model" +engine);
        return engine;
    }
}
