package praticeSession.program_pratice;

public class MiniumNumberStack {
int[] arr = new int[1000];
    int top;
    MiniumNumberStack(){
        top = -1;
    }

    public void push(int data){
       arr[++top] = data;
       // System.out.println(arr[top]);
    }

    public void pop(){
        if(top>-1){
            System.out.println(arr[top]);
            top--;
        }



        }
    public void search(){
        int m = arr[0]; // 1

        for (int i = top ; i >-1 ; i--) {  //0, 2,6,4,1
           // System.out.print(arr[i] +  "  "+"  "   );

            if(arr[i] < m){ // 10<1, 9<1, 6<1, 0<1
                int min = arr[i];
                System.out.println("mini  ::" + min);
            }
           System.out.println(arr[i]);
        }

    }




    public static void main(String[] args) {
      //{1,4,6,2,0,6,9,10};
        MiniumNumberStack m = new MiniumNumberStack();
        m.push(10);
        m.push(4);
        m.push(6);
        m.push(2);
        m.push(6);
        m.push(9);
        m.push(10);
        m.search();


    }
}
