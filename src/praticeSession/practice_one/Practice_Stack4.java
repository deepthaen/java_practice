package praticeSession.practice_one;

public class Practice_Stack4 {

    int top;
    int[] arr = new int[1000];

    Practice_Stack4(){
        top=-1;
    }

    public void push(int data){
        arr[++top] =data;
        System.out.println("Push  :"+data);
    }

    public void pop(){
        if(top>-1){
            System.out.println("pop :"+ arr[top]);
            top--;
        }
    }


    public static void main(String[] args) {
        Practice_Stack4 s = new Practice_Stack4();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(60);
        System.out.println(s);
        s.pop();
        s.push(80);
        System.out.println();

    }
}
