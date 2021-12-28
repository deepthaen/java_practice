package praticeSession.collectionFrameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.peek();
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}
