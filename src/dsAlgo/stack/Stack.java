package dsAlgo.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    static int[] arr= new int[1000];
    int top;
    Stack(){

        top=-1;
    }

    void push(int data){
        //[5,6,8]
        //top=0,top=1,top=2
        arr[++top]=data;
        System.out.println("Pushing :: "+data);
    }


    void pop(){//8
        if(top>=0){//top=1
            System.out.println("poping : "+arr[top]);
          top--;
        }
    }

    void peek(){
        if(top>=0){
            System.out.println("Peeking :: "+arr[top]);
        }
    }

    boolean isEmpty(){
        if(top==-1) {
            System.out.println("its Empty");
            return true;
        }else{
            System.out.println("Not Empty");
        }
        return false;
    }
    void printAll(){
            for (int i = top; i >-1; i--) {
                System.out.print(arr[i]+" ");
            }
        System.out.println();

    }


    public static void main(String[] args) {
        Stack st = new Stack();
        st.isEmpty();
        st.push(10);
        st.push(15);
        st.push(30);
        st.pop();
        st.push(50);
        st.peek();
        st.printAll();
        st.isEmpty();
    }
//Push, pop, peek, top, print, isempty


    //pushing = ++top
    //pop = top--;
}
