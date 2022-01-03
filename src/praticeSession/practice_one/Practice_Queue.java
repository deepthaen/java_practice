package praticeSession.practice_one;

public class Practice_Queue {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    Practice_Queue(){
        front = 0;
        rear = 0;
        int capacity = size;
        arr = new int[size];
    }

    public void enQueue(int data){
        front = front%capacity;
        System.out.println("");
    }

    public void dqQueue(){

    }

    public static void main(String[] args) {
        Practice_Queue q = new Practice_Queue();
    }


}
