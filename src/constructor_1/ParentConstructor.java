package constructor_1;

public class ParentConstructor {

    String  a;
    int b;
    public  ParentConstructor(String a, int b){
        this.a =a;
        this.b = b;
        System.out.println("Running parent "+a+b);
    }

    public void run(){
        System.out.println("running run method");
    }
}
