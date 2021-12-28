package praticeSession.collectionFrameWork;

public class StackImp {

    int[] arr = new int[1000];
    int top;

    StackImp(){
        top =-1;
    }

    public void push(int data){
        arr[++top]= data;
        System.out.println("pushing  "+data);

    }

    public void pop(){
        if(top>0){
            System.out.println("Poping  ::"+arr[top]);
            top--;
        }
    }

    public void peek(){
        if(top>=0){
            System.out.println("Peeking ::" + arr[top]);
        }
    }

    public boolean  isEmpty(){
        if(top==-1){
            System.out.println("EMpty");
            return true;

        }else{
            System.out.println("not empty");
        }
        return false;
    }

    public void printAll(){
        for (int i = top; i >-1 ; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        StackImp s = new StackImp();
        s.push(4);
        s.push(7);
        s.push(3);
        s.push(100);
        s.push(90);
        s.pop();
        s.peek();
        s.push(900);
        s.printAll();

    }
}
