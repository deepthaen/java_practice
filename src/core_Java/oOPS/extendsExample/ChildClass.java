package core_Java.oOPS.extendsExample;

public class ChildClass extends ParentClass{

    public static  void engine(){
        System.out.println("different engine");
    }

    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        p.car();
        p.models();
        engine();
    }
}
