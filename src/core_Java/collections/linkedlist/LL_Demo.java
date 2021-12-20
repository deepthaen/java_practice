package core_Java.collections.linkedlist;

import java.util.LinkedList;

public class LL_Demo {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Deep");
        ll.add("12345678");

        ll.size();
       String s =  ll.get(1);
       System.out.println(s);
    }
}
