package praticeSession;

public class defaultThreads {


    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Defaut thread"+Thread.currentThread().getId());
        System.out.println("Default Thread"+Thread.currentThread().getName());
    }

}
