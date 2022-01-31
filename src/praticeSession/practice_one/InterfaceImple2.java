package praticeSession.practice_one;

public class InterfaceImple2 implements InterfacePractice{
    @Override
    public void vehicleType() {
        System.out.println("Bus");
    }

    @Override
    public String engine() {
        String s = "Desil";
        System.out.println(s);
        return s;
    }

    @Override
    public void machine(String m) {
        System.out.println(m);

    }

    public static void main(String[] args) {
        InterfacePractice i = new InterfaceImple();
        InterfacePractice m = new InterfaceImple2();
        i.vehicleType();
        m.vehicleType();

    }
}
