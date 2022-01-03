package praticeSession.practice_one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice_Set {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(20);
        s1.add(30);
        System.out.println(s1);

        Integer[] arr1 = {10,20,40,50};
        Set<Integer> s2 = new HashSet<>();

        Integer[] arr2 = {30,40,60,70};
        Set<Integer> s3 = new HashSet<>();

        s2.addAll(Arrays.asList(arr1));
        s3.addAll(Arrays.asList(arr2));

        Set<Integer> s4 = new HashSet<>(s1);
        s4.addAll(s2);
        System.out.println(s4);

        Set<Integer> s5 = new HashSet<>(s1);
         s5.retainAll(s2);
        System.out.println(s5);

        Set<Integer> s6 = new HashSet<>();
        s6.removeAll(s2);
        System.out.println(s6);



    }
}
