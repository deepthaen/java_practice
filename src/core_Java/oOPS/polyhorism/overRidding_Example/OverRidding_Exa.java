package core_Java.oOPS.polyhorism.overRidding_Example;

public class OverRidding_Exa implements OverRiding_Interface{
    @Override
    public void car() {
        System.out.println("Audi");
    }

    @Override
    public String engine() {
        String e = "Petrol";
        return e;
    }

    @Override
    public String model(String m) {
        String a = "A4";
        return a;
    }
}
