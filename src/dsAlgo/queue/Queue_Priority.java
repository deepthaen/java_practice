package dsAlgo.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Priority {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(10);
        q.add(21);
        q.add(3);
        q.add(42);
        q.add(40);
        q.add(5);
        System.out.println(q);


        q.poll();
        System.out.println(q);
    }
}
