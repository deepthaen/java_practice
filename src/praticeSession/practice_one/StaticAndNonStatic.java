package praticeSession.practice_one;

public class StaticAndNonStatic {

    public  String name = "Deep";
    public static int age  = 20;


    public void nonStaticMethod(){
        String city ="Mysore";

        System.out.println("Non Static  ::" +name+ "  "+city);
        System.out.println(age);
    }

    public static void staticMethos(){
        String state = "KAR";
        System.out.println("static Method :"+state + "  ");
        System.out.println(age);
     //   System.out.println(name); -- non staic variable

    }

    public String nonStaticMethodReturnable(){
        String m = "Deeptha";

        return m;
    }

    public void nonStaticMethodReturnable(String n){
        System.out.println("Parameterized :"+n);

    }
    public static void main(String[] args) {
        StaticAndNonStatic s = new StaticAndNonStatic();
        s.nonStaticMethod();
        staticMethos();
        String n =  s.nonStaticMethodReturnable();
        System.out.println("returnable :: "+n);
        s.nonStaticMethodReturnable(n);
        s.nonStaticMethodReturnable("bangalore");



    }
}
