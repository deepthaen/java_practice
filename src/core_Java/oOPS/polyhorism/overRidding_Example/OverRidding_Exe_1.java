package core_Java.oOPS.polyhorism.overRidding_Example;

public class OverRidding_Exe_1 implements OverRiding_Interface {
    @Override
    public void car() {
        System.out.println("Create");
    }

    @Override
    public String engine() {
        String e = "Petrol";
        return e;
    }

    @Override
    public String model(String m) {
        String a = "S4";
        return a;
    }
}
