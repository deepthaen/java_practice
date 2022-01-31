package practiceSession2;

public class AbstractImplemention extends AbstractExample{
    @Override
    public void carType() {
        System.out.println("audi");
    }

    @Override
    public String engine() {
        String ie = "petrol";
        System.out.println(ie);
        return ie;
    }

    @Override
    public void design(String e) {
        System.out.println("design ::"+e);

    }

    public static void main(String[] args) {
        AbstractExample a = new AbstractImplemention();
        a.carType();
       String s= a.engine();
       a.design(s);
       a.carDesign();

    }
}
