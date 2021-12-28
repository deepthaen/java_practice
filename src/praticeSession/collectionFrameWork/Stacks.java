package praticeSession.collectionFrameWork;

public class Stacks {

    int[] arr = new int[1000];
    int top;

    Stacks(){
        top =-1;
    }

    public void push(int data){
       arr[++top]= data;
        System.out.println("pushing "+ data);
    }

    public void pop(){
        if(top>=0){
            System.out.println(""+arr[top]);
            top--;
        }
    }

    public void peek(){
        if(top>=0) {
            System.out.println("" + arr[top]);
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

    public void printAll(){
        for (int i = top; i >-1; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(10);
        s.push(30);
        s.pop();
        s.push(50);
        s.peek();
        s.printAll();
    }
}
