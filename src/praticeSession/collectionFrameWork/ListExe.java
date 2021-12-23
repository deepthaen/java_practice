package praticeSession.collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListExe {

    public static void listExample(){
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(4);
        lst.add(0,5);
      int size =  lst.size();
       int l = lst.get(1);
        System.out.println(lst);
        System.out.println(size);
        System.out.println(l);

    }

    public static void main(String[] args) {
        listExample();
    }
}
