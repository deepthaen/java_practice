package abstractExample;

public class Execution_test extends  Abstract_2{
    @Override
    void method() {
        System.out.println("Method 1");
    }


    public static void main(String[] args) {
        Abstract_2 a = new Execution_test();
        a.method(); // declared
        a.method2();// implemtation
    }



    // hide implementaion and show functionality
}
