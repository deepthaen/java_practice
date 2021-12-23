package dsAlgo.stack;

public class StackElement {

    int[] arr = new int[1000];
    int top;

    // this constricotr
    StackElement(){
        top = -1;
    }

    public void pushing(int data){
        arr[++top] = data;
        System.out.println("Pushing" + data);
    }

    public void pop(){
        if(top>=0){
            System.out.println("poping Element" + arr[top]);
            top--;
        }

    }

    public void peek(){
        if(top>=0){
            System.out.println("peek element" +arr[top]);
        }

    }
    public boolean isempty(){
        if(top == -1){
            System.out.println("Stack empty");
            return true;
        }else{
            System.out.println("Not empty");
        }
        System.out.println(" ");
        return false;
    }

    public void printAll(){
        for (int i = top; i >-1 ; i--) {
            System.out.println( arr[i]);
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        StackElement s = new StackElement();
        s.isempty();
        s.pushing(50);
        s.pushing(20);
        s.pushing(30);
        s.pushing(50);
        s.pop();
        s.pushing(90);
        s.printAll();



    }
}
