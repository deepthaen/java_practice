package practiceSession2;

public class MultiThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("running thread");
    }

    public static void main(String[] args) {
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();
        t1.start();
        t2.start();
        for (int i = 0; i < 5; i++) {
            MultiThread t3 = new MultiThread();
            t3.start();

        }


    }
}
