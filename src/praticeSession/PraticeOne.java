package praticeSession;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class PraticeOne {
    public int s = 5;

    public PraticeOne(){
        System.out.println("Running construcotr");
    }
    public static void main(String[] args) {
        String s = "Deeptha";
        method();
        PraticeOne p = new PraticeOne();
        p.method2();
    }

    public static void method(){
        System.out.println("static method");

    }

    public void method2(){
        System.out.println("Non Static Mehtod");
    }
}
