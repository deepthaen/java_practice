package praticeSession;

public class SingleThreads extends Thread{
    public void run(){
        System.out.println("single thread running");
    }

    public static void main(String[] args) {
        SingleThreads t = new SingleThreads();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        t.start();
        t.run();
    }
}
