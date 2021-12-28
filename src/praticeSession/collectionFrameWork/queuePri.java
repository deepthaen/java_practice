package praticeSession.collectionFrameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class queuePri {

    public void queuePririty(){
        Queue<Integer> qe = new PriorityQueue<>();
        qe.add(40);
        qe.add(50);
        qe.add(70);
        qe.add(39);
        System.out.println(qe);
        qe.poll();
        System.out.println("polling"+qe);
        qe.add(35);
        System.out.println(qe);
        qe.peek();
        System.out.println(qe);

    }


    public static void main(String[] args) {
        queuePri q = new queuePri();
        q.queuePririty();

    }
}
