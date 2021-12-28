package praticeSession.collectionFrameWork;

public class StackExemp {

    /**
     * push pop peek top
     */

    int[] arr = new int[1000];
    int top;

    StackExemp() {
        top = -1;
    }

    public void push(int data) {
        arr[++top] = data;
        System.out.println("Pushinng  " + data);


    }

    public void pop() {
        if (top > 0) {
            System.out.println("poping  " + arr[top]);
            top--;

        }
    }

    public void peek() {
        if (top > 0) {
            System.out.println("poping  " + arr[top]);
        }
    }

    public void printAll() {
        for (int i = top; i > -1; i--) {
            System.out.println(arr[i]);

        }
    }

    public boolean isEmpty(){
        if(top ==-1){
            System.out.println("empty");
            return true;
        }else{
            System.out.println("Not empty");
        }

        return false;
    }
    public static void main(String[] args) {
        StackExemp s = new StackExemp();
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.pop();
        s.push(35);
        s.peek();
        s.push(90);
        s.printAll();


    }
}

