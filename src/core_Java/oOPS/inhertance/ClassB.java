package core_Java.oOPS.inhertance;

public class ClassB extends ClassA{

    public static void main(String[] args) {
       ClassB b = new ClassB();
       b.sum();
       b.sub();
       int e = b.Mul(5,6);
      int c =  b.div(4,8);
    }

    public int div(int a, int b){
        int c = a/b;
        return c;
    }
}
