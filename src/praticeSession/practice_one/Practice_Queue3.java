package praticeSession.practice_one;

public class Practice_Queue3 {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    Practice_Queue3(int size){
        this.size = size;
        front = 0;
        rear = 0;
        capacity = size;
        arr = new int[size];
    }

    public void enQueue(int data){
        rear = rear%capacity;
        arr[rear] = data;
        System.out.println("enqueue ::"+data);
        rear++;
    }

    public void deQueue(){
        front = front%capacity;
        System.out.println("Dequeue ::"+arr[front]);
        front++;
    }

    public static void main(String[] args) {
        Practice_Queue3 q = new Practice_Queue3(5);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60);
        q.deQueue();
    }
}
