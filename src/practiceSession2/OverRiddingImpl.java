package practiceSession2;

public class OverRiddingImpl implements OverRiddingInterface{
    @Override
    public void vechicle() {
        System.out.println("audi");
    }

    @Override
    public void engine() {
        System.out.println("Desil");
    }

    @Override
    public void distance() {
        System.out.println("40 Km");

    }

    public static void main(String[] args) {
        OverRiddingInterface o = new OverRiddingImpl();
        o.vechicle();
        o.engine();
        o.distance();
    }
}
