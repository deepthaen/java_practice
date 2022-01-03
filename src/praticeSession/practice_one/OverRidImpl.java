package praticeSession.practice_one;

public class OverRidImpl implements OverRid{
    @Override
    public void car() {
        System.out.println("Audi");
    }

    @Override
    public void engine(String e) {
        System.out.println(e);
    }

    @Override
    public String model() {
        String n = "A4";
        return n;
    }

    public static void main(String[] args) {
        OverRid o = new OverRidImpl();
        o.car();
        o.engine("Petrol");
        String m = o.model();
        System.out.println(m);
    }
}
