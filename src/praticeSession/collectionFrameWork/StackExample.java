package praticeSession.collectionFrameWork;

public class StackExample {

    int[] arr = new int[1000];
    int top;
    StackExample(){
        top= -1;
    }


    public void push(int data){
        arr[++top] = data;
        System.out.println("pushing"+data);
    }
    public void pop(){
        if(top>0)
        System.out.println("poping "+arr[top]);
        top--;

    }

    public boolean isEmpty(){
        if(top==-1){
            System.out.println("Its empty stack");
            return true;

        }else{
            System.out.println("Its not empty stack");
        }

        return false;
    }

    public void peek(){
        if(top>=0)
        System.out.println(arr[top]);

    }

    public void printAll(){
        for (int i = top; i >-1; i--) {
            System.out.println("Print all element in stack ::" +arr[i]);

        }



    }

    public static void main(String[] args) {
        StackExample s = new StackExample();
        s.isEmpty();
        s.push(90);
        s.push(40);
        s.push(50);
        s.push(20);
        s.push(10);
        s.pop();
        s.push(70);
        s.peek();

        s.printAll();
        s.isEmpty();
    }

}
