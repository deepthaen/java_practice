package dsAlgo.queue;

public class Queue {


    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;
    Queue(int size){
        this.size =size;
        front =0;
        rear=0;
        capacity=size;
        arr= new int[size];
    }


    public  void enQueue(int data){ //[20,10,0,0,0]
        // if i want to add, i need to add at rear
        rear =rear%capacity; //0%5=0
        arr[rear]=data; //arr[0]=20, arr[1]=10,arr[2]=30
        System.out.println("Enqueuing ::  "+data);
        rear++; //rear=1,2
    }

    public void dequeue(){
        // if i want remove, i shud remove front
        if(size>0){
            front = front%capacity;
            System.out.println("Dequeing :: "+arr[front]);
            front++;
        }
    }

    public void print(){
        // print which is @ front
        if(size>0){
            System.out.println("print front :: "+arr[front]);
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(20);
        q.enQueue(10);
        q.enQueue(30);
        q.enQueue(50);
        q.enQueue(40);

        q.dequeue();
        q.print();

    }


}
