package core_Java.threads_con;

public class SingleThread extends  Thread{
    @Override
    public void run() {
        System.out.println("Runing run method of thread");
    }

    public static void main(String[] args) {
        SingleThread single = new SingleThread();
        single.start();
    }
}
