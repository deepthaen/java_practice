package praticeSession.practice_one;

public class InterfaceImple implements InterfacePractice{
    @Override
    public void vehicleType() {
        System.out.println("Audi");
    }

    @Override
    public String engine() {
        String e = "Petrol";
        return e;
    }

    @Override
    public void machine(String m) {
        System.out.println(m);
    }

    public static void main(String[] args) {
        InterfacePractice i = new InterfaceImple();
        i.vehicleType();
        String e = i.engine();
        i.machine(e);
        System.out.println(e);
    }
}
