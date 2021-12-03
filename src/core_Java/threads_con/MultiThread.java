package core_Java.threads_con;

public class MultiThread extends  Thread{
    @Override
    public void run() {
        System.out.println("Running Thread run method   "+ Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MultiThread t = new MultiThread();
            t.start();
        }

    }
}
