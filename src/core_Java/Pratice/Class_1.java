package core_Java.Pratice;

public class Class_1 implements Interface_1{
    @Override
    public void car() {
        System.out.println("interface 1 running");
    }

    public static void main(String[] args) {
        Interface_1 i = new Class_1();
        i.car();
    }
}
