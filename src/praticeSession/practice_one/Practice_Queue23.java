package praticeSession.practice_one;

public class Practice_Queue23 {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;
    Practice_Queue23(int size){
        this.size = size;
        front = 0;
        rear = 0;
        capacity = size;
        arr = new int[size];
    }
    public void enqueue(int data){
        rear = rear%capacity;
        arr[rear] = data;
        System.out.println("Enquee  :"+ data);
        rear ++;
    }

    public void dequeue(){
        if(size>0){
            front = front%capacity;
            System.out.println("Dequeue ::"+ arr[front]);
            front++;
        }


    }

    public void peek(){
        if(size>0){
            for (int i = 0; i < arr.length-1; i++) {
                System.out.println(arr[i]);
            }

        }
    }

    public static void main(String[] args) {
        Practice_Queue23 q = new Practice_Queue23(5);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.enqueue(70);
        q.peek();

    }
}
