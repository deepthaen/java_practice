package core_Java.collections.linkedlist;

public class LL_Impl {


    class Node{
        Node next;
        int data;
        Node(int data) {
            this.data = data;//2
            this.next = null;
        }
    }

    //Head -Next[null] - tail


    Node head=null;
    Node tail=null;
    //head(null) - next(null) -[2]-[]-[] -tail(null)
    //head [2] -[3] tail

    public void add(int data){
        Node node = new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }else{
            head.next=node;
            tail=node;
        }
    }


    public static void main(String[] args) {
        LL_Impl ll = new LL_Impl();
        ll.add(2);
        ll.add(3);
    }

}
