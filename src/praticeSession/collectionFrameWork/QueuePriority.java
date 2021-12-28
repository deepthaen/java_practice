package praticeSession.collectionFrameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(20);
        q.add(15);
        q.add(40);
        q.add(25);
        System.out.println("queue"+q);
        q.poll();
        System.out.println(q);

    }
}
