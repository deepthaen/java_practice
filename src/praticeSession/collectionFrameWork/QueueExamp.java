package praticeSession.collectionFrameWork;

public class QueueExamp {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    QueueExamp(int size){
        front = 0;
        rear = 0;
        capacity = size;
        arr= new int[size];
    }

    public void enQueue(int data){
        rear=rear%capacity;
        arr[rear] = data;
        System.out.println("enqueu  " +data);
        rear++;
    }

    public void dequeue() {
        if (size>=0) {
            front = front % capacity;
            System.out.println("Dequeue "+ arr[front]);
            front++;
        }
    }
        public void print(){
            if(size>=0){
                System.out.println("Print "+arr[front]);
            }
        }





    public static void main(String[] args) {
        QueueExamp q = new QueueExamp(5);
        q.enQueue(20);
        q.enQueue(24);
        q.enQueue(50);
        q.enQueue(55);
        q.dequeue();
        q.enQueue(35);
        q.print();

    }
}
