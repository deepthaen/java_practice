package abstractExample;

public class Abstract_Test extends Abst_1{
    @Override
    void car() {
        System.out.println("Audi car");
    }

    @Override
    String carEngine() {
        System.out.println("A6");
        return null;
    }

    public static void main(String[] args) {

        Abst_1 a = new Abstract_Test();
        a.car();
        a.model();
        a.carEngine();
    }
}
