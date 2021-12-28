package praticeSession.collectionFrameWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIm {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();
        s.add(30);
        s.add(10);
        s.add(25);
        s.add(60);
        s.add(90);

        System.out.println("Set Integer"+ s);
        Integer[] arr = {11, 22, 33,40, 60, 25};
        Integer[] arr1 = {1, 2, 33,40, 60, 2};

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr));
        System.out.println(s1);


        Set<Integer> s2 = new HashSet<>();
        s2.addAll(Arrays.asList(arr1));
        System.out.println(s2);

        Set<Integer> s3 = new HashSet<>(s1);
        s3.retainAll(s2);
        System.out.println(s3);

        Set<Integer> s4 = new HashSet<>(s1);
        s3.removeAll(s2);
        System.out.println(s4);

        Set<Integer> s5 = new HashSet<>(s1);
        s3.addAll(s2);
        System.out.println(s5);

    }
}
