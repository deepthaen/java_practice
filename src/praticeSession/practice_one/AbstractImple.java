package praticeSession.practice_one;

public class AbstractImple extends AbstractClass{
    @Override
    public void abstractClass1() {
        System.out.println("abstract class");

    }

    public static void main(String[] args) {
        AbstractImple a = new AbstractImple();
        a.abstractClass1();
        a.class2();
    }
}
