package practiceSession2;

public class SIngleThread extends Thread {
    public void run(){
        System.out.println("running thread");

    }

    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println( Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());

    }
}
