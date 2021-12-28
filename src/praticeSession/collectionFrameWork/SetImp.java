package praticeSession.collectionFrameWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetImp {

    public void setEx(){
        Set<Integer> s = new HashSet<>();
        s.add(25);
        s.add(40);
        s.add(50);
        s.add(60);
        s.add(90);
        Integer[] arr = {20,40,50,30,50,11,33};
        Integer[] aar1 = {11,22,33,44,55,50,30};
        System.out.println(s);

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr));
        Set<Integer> s2 = new HashSet<>();
        s2.addAll(Arrays.asList(aar1));

        Set<Integer> s3 = new HashSet<>(s1);
        s3.addAll(s2);
        System.out.println(s3);

        Set<Integer> s4 = new HashSet<>(s1);
        s4.retainAll(s2);
        System.out.println(s4);

        Set<Integer> s5 = new HashSet<>(s1);
        s5.removeAll(s2);
        System.out.println(s5);

    }

    public static void main(String[] args) {
        SetImp s = new SetImp();
        s.setEx();

    }
}
