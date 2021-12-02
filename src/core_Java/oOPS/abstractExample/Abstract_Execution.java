package core_Java.oOPS.abstractExample;

public class Abstract_Execution extends AbstractExam{


    @Override
    public void click() {
        System.out.println("click on login");
    }

    public static void main(String[] args) {
        Abstract_Execution a = new Abstract_Execution();
        a.browser();
        a.click();
    }
}
