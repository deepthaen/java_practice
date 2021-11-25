package interfaceAndAbstract;

public class InterfaceImplemention implements Interface_1{
    @Override
    public void car() {
        System.out.println("AUdi");
    }

    @Override
    public String engine() {
        String e = "Pertol";
        System.out.println(e);
        return e;
    }

    @Override
    public String model(String m) {
        System.out.println(m);
        return m;
    }
}
