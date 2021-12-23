package praticeSession.collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayLsitExe {

    public void arrayExample(){
        List<String> l = new ArrayList<>();
        l.add("Deep");
        l.add("DOnekey");
        l.add(0,"Monkey");
        l.add("Animal");
       String i = l.get(0);
       int p = l.size();
        l.set(1,"Dog");
        System.out.println(l);
        System.out.println(p);
        System.out.println(i);


    }

    public static void main(String[] args) {
        ArrayLsitExe a = new ArrayLsitExe();
        a.arrayExample();
    }
}
