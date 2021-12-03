package core_Java.threads_con;

import core_Java.oOPS.encapsulation.ThreadImp;

public class ThreadDefault {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
