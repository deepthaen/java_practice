package praticeSession.practice_one;

public class Practicr_Queue1 {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    Practicr_Queue1(int size){
        this.size = size;
        front = 0;
        rear = 0;
        capacity = size;
        arr = new int[size];
    }

    public void enqueue(int data){
        rear = rear%capacity;
        arr[rear] = data;
        System.out.println("enqueue ::"+data);
        rear++;
    }

    public void dequeue() {
        if (size > 0) {
            front = front % capacity;
            System.out.println("Dequeue :" + arr[front]);
        }

    }
        public void peek(){
            if(size>0){
                front = front%capacity;
                System.out.println("peek :"+ arr[front]);
            }
    }


    public static void main(String[] args) {
        Practicr_Queue1 q = new Practicr_Queue1(5);
        q.enqueue(60);
        q.enqueue(50);
        q.enqueue(70);
        q.enqueue(45);
        q.dequeue();
        q.enqueue(20);
        q.peek();
    }


}
