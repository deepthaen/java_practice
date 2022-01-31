package practiceSession2;

public class InterfaceImplemention implements InterfaceExeample1{
    @Override
    public void car() {
        System.out.println("audi");
    }

    @Override
    public String engine() {
        String e = "petrol";
        return e;
    }

    @Override
    public void vechicle(String e) {
        System.out.println("vechicle "+e);
    }

    public static void main(String[] args) {
        InterfaceExeample1  i = new InterfaceImplemention();
        i.car();
        String ie = i.engine();
        System.out.println(ie);
        i.vechicle(ie);
    }
}
