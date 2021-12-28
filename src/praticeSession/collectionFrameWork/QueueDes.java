package praticeSession.collectionFrameWork;

public class QueueDes {

    /**
     * front, rear, size capacity
     */

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    QueueDes(int size){
        this.size = size;
        front = 0;
        rear = 0;
        capacity = size;
        arr = new int[size];
    }

    public void enQueue(int data){
        rear=rear%capacity;
        arr[rear]= data;
        System.out.println("enqueue  "+data);
        rear++;
    }

    public void dequeu(){
        if(size>=0)
        front=front%capacity;
        System.out.println("Dequeue  "+arr[front]);
        front++;
    }

    public void peek(){
        if(size>=0){
            System.out.println("Peek  "+arr[front]);
        }
    }

    public static void main(String[] args) {
        QueueDes q = new QueueDes(5);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(70);
        q.enQueue(80);
        q.enQueue(90);
        q.dequeu();
        q.peek();


    }


}
