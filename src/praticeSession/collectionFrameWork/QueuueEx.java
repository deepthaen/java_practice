package praticeSession.collectionFrameWork;

public class QueuueEx {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    QueuueEx(int size){
        this.size = size;
        front=0;
        rear=0;
        capacity=size;
        arr = new int[size];
    }

    public void enQueue(int data){
        rear=rear%capacity;
        arr[rear]= data;
        System.out.println("Enqueue data "+data);
        rear++;
    }

    public void dequeue(){
        if(size>0)
        front=front%capacity;
        System.out.println("Dequeue "+arr[front]);
        front++;
    }

    public void print(){
        if(size>0)
            System.out.println("Print" +arr[front]);

    }


    public static void main(String[] args) {
        QueuueEx q = new QueuueEx(5);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(10);
        q.enQueue(20);
        q.dequeue();
        q.enQueue(90);
        q.enQueue(45);
        q.print();
    }
}
