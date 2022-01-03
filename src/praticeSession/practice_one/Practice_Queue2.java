package praticeSession.practice_one;

import java.util.PriorityQueue;
import java.util.Queue;

public class Practice_Queue2 {

    public void queue(){
        Queue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        System.out.println(q);
        q.peek();
        System.out.println(q);
        q.add(90);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }


    public static void main(String[] args) {
        Practice_Queue2 pq = new Practice_Queue2();
        pq.queue();
    }
}
