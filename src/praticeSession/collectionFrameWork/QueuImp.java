package praticeSession.collectionFrameWork;

public class QueuImp {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    QueuImp(int size){
        this.size = size;
        front = 0;
        rear = 0;
        capacity = size;
        arr = new int[size];

    }

    public void enqueue(int data){
        rear = rear%capacity;
        arr[rear]=data;
        System.out.println("Enqueue"+data);
        rear++;
    }

    public void dequue(){
        if(size>0){
            front = front%capacity;
            System.out.println("Dequeue "+arr[front]);
            front++;
        }
    }

    public void print(){
        if(size>0){
            System.out.println("peeking "+arr[front]);
        }

    }

    public static void main(String[] args) {
        QueuImp q = new QueuImp(5);
        q.enqueue(30);
        q.enqueue(50);
        q.enqueue(10);
        q.dequue();
        q.print();
        q.enqueue(45);
        q.enqueue(30);
    }

}
