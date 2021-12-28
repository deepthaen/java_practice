package praticeSession.collectionFrameWork;

public class Queue {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    Queue(int size){
        this.size = size;
        front =0;
        rear = 0;
        capacity = size;
        arr = new int[size];

    }

    public void enqueue(int data){
        rear = rear%capacity;
        System.out.println("Adding "+data);
        rear++;
    }

    public void dequeue() {
        if (size > 0) {
            front = front%capacity;
            System.out.println("Removing "+arr[front]);
            front++;
        }
    }
        public void print(){
            if(size>0){
                System.out.println(arr[front]);
            }
        }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.dequeue();

    }

    }

