package praticeSession.collectionFrameWork;

public class StackIm {

    int[] arr = new int[1000];
    int top;

    /**
     * push, pop, peek, top
     */
    StackIm(){
        top = -1;
    }

    public void push(int data){
        arr[++top] = data;
        System.out.println("pushing data "+data);
    }

    public void pop(){
        if(top>=0){
            System.out.println("poping data "+arr[top]);
            top--;
        }

    }

    public void peek(){
        if(top>=0) {
            System.out.println("peeking data " + arr[top]);
        }
    }
    public boolean isEmpty(){

        if(top==-1){
            System.out.println("empty");
            return true;
        }else{
            System.out.println("not empty");
        }

        return false;
    }

    public void printAll(){
        for (int i = top; i >-1 ; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackIm s = new StackIm();
        s.push(20);
        s.push(10);
        s.push(30);
        s.pop();
        s.push(80);
        s.peek();
        s.push(55);
        s.printAll();

    }
}
