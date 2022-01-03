package praticeSession.practice_one;

public class Practice_Stack {

   int[] arr = new int[1000];
    int top;
    Practice_Stack(){
        top = -1;
    }

    public void push(int data){
       arr[++top] = data;
        System.out.println("Push element  ::" +data);

    }

    public void pop(){
        if (top >-1){
            System.out.println("pop elemnet  ::" + arr[top]);
            top--;
        }

    }
    public void peek(){
        if (top > -1) {
            System.out.println("peek elemnet  ::" + arr[top]);
        }
    }

    public boolean isEMpty(){
        if(top == -1){
            System.out.println("empty");
            return true;
        }else{
            System.out.println("not empty");
        }

        return false;
    }

    public void print(){
        for (int i = top; i >-1 ; i--) {
            System.out.println("print all " +arr[i]);

        }

    }

        ///




    public static void main(String[] args) {
        Practice_Stack p = new Practice_Stack();
        p.push(20);
        p.push(30);
        p.push(40);
        p.push(50);
       // p.pop();
        p.push(45);
        p.push(55);
       // p.peek();
       // p.isEMpty();
        //p.print();

    }
}
