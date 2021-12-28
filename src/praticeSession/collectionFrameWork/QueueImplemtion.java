package praticeSession.collectionFrameWork;

public class QueueImplemtion {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    QueueImplemtion(int size){
        this.size =size;
        front =0;
        rear=0;
        capacity=size;
        arr= new int[size];

    }

    public void enqueue(int data){
        rear = rear%capacity;
        arr[rear]=data;
        System.out.println(data);
        rear++;
    }

    public void dequeue(){
        if(size>0){
            front= front%capacity;
            System.out.println(arr[front]);
            front++;
        }
    }

    public void print(){
        if (size>0){
            System.out.println(arr[front]);
        }
    }


    public static void main(String[] args) {
        QueueImplemtion q = new QueueImplemtion(5);
        q.enqueue(20);
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(50);
        q.enqueue(40);
        q.dequeue();
        q.print();

    }
    }

