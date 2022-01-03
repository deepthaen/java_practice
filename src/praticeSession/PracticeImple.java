package praticeSession;

public class PracticeImple implements Practice{
    @Override
    public void car() {
        System.out.println("notmal method");
    }

    @Override
    public String Model() {
        String m = "Audi";
        return m;
    }

    @Override
    public String engine(String e) {
        System.out.println("engine : " +e);
        String m = "petrol";
        return m;
    }

    public static void main(String[] args) {
        PracticeImple p = new PracticeImple();
        p.car();
        String mo =p.Model();
        String en = p.engine(mo);
        System.out.println(en);
    }
}
