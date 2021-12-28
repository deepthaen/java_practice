package praticeSession.collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class Lst {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(40);
        l.add(45);
        l.add(20);
        l.add(25);
        l.add(50);
        System.out.println(l);
        int i =l.get(1);
        System.out.println(i);
        l.add(2,100);
        System.out.println(l);

    }
}
