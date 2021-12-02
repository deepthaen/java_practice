package core_Java.oOPS.polyhorism.overRidding_Example;

public class OverRidding_execution {

    public static void main(String[] args) {
        OverRiding_Interface o = new OverRidding_Exa();
        OverRiding_Interface i = new OverRidding_Exe_1();

        o.car();
        String a = o.engine();
        o.model(a);

        i.car();
        String s = i.engine();
        i.model(s);
    }
}
