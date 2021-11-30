package core_Java.interfaces;

public class CurrentClass implements Interface_1, Interface_2{


    @Override
    public void methos_1() {
        System.out
                .println("Method one running");
    }

    @Override
    public void method_2() {
    System.out.println("Method two runnning");
    }

    @Override
    public String method_string() {
        System.out.println("String Method");
        return null;
    }


}
