package core_Java.interfaceAndAbstract;

public class InterfaceExecu {

    public static void main(String[] args) {
        Interface_1 i = new InterfaceImplemention();
        i.car();
        String e= i.engine();
        i.model(e);
    }
}
