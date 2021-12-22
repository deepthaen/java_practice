package praticeSession;

public class MultiThread extends Thread{
    public void run(){
        System.out.println("Multi Thread running");
    }

    public static void main(String[] args) {
        MultiThread t = new MultiThread();
        MultiThread t1 = new MultiThread();
        t.start();
        t1.start();
        for (int i = 1; i<= 10; i++){
            MultiThread t3 = new MultiThread();
            t3.start();
        }
    }
}
