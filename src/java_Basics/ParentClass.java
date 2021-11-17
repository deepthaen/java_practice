package java_Basics;


public class ParentClass {

    String name = "Deeptha";
    int num = 9;
    double salary = 15000.00;
    long bnk_Accnt = 5645677574775L;
    boolean b = true;
    char ch  = 'a';



    public static void main(String[] args){
        staticmethod();
        sum();

      //create Constructor
      ParentClass p = new ParentClass();
      p.nonstatic();
    }
     // static method
    public static void staticmethod(){
        System.out.println("static method");
    }

    // static method with return type
    public static int sum(){
        int a=2, b=3;
        int s = a+b;
        System.out.println(s);
        return s;
    }


    //non static method
    public void nonstatic(){
        System.out.println("non static method");
    }


}
