package abstractExample;

public class Execution2  implements Interface_1{

    @Override
    public void car() {

    }

    @Override
    public String carEngine() {
        return null;
    }

    public static void main(String[] args) {
        Interface_1 a = new Execution2();
        a.car();
        a.carEngine();
    }
}
