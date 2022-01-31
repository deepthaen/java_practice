package practiceSession2.dsAlogo;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

    public static void listEx(){
        List<Integer> ll = new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.get(0);
        ll.add(1,30);
       int s =  ll.size();
        System.out.println(ll);
        System.out.println(s);
    }

    public static void main(String[] args) {
        listEx();
    }
}
