package practiceSession2;

public class OverRidding implements OverRiddingInterface{


    @Override
    public void vechicle() {
        System.out.println("car");
    }

    @Override
    public void engine() {
        System.out.println("Petrol");
    }

    @Override
    public void distance() {
        System.out.println("20 Km");

    }

    public static void main(String[] args) {
        OverRiddingInterface i = new OverRidding();
        i.engine();
        i.distance();
        i.vechicle();
    }
}
