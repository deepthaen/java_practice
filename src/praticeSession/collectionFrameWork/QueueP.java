package praticeSession.collectionFrameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueP {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.add(60);
        System.out.println(q);
        q.peek();
        System.out.println(q);
        q.add(70);
        System.out.println(q);

    }
}
