package praticeSession;

public class DefaultThread {

    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

    }
}
