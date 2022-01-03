package praticeSession.practice_one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice_SET2 {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Integer[] arr = {10,20,30,40,50,60,70};

        Set<Integer> s2 = new HashSet<>();
        Integer[] arr2 = {35,55,60, 40, 70, 30, 60};

        s1.addAll(Arrays.asList(arr));
        s2.addAll(Arrays.asList(arr2));

        Set<Integer> s3 = new HashSet<>(s1);
        s3.addAll(s2);
        System.out.println(s3);

        Set<Integer> s4 = new HashSet<>();


        Set<Integer> s5 = new HashSet<>();

    }
}
