package oOPS.abstraction;

public class AbstractionExe {

    public static void main(String[] args) {
        Interface_1 i = new AbstractionImpl();
        i.car();
        String a = i.engine();
        i.model(a);
    }
}
