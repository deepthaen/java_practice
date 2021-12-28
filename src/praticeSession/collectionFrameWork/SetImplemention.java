package praticeSession.collectionFrameWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetImplemention {


    public static void main(String[] args) {
        SetImplemention s = new SetImplemention();

        Set<Integer> s1 = new HashSet<>();
        Integer[] arr1= {29,30,22,50,36,45,50};
        s1.addAll(Arrays.asList(arr1));
        System.out.println(s1);

        Set<Integer> s2 = new HashSet<>();
        Integer[] arr2={33,50,10,60,99};
        s2.addAll(Arrays.asList(arr2));
        System.out.println(s2);

        // Union All
        Set<Integer> s3 = new HashSet<>(s1);
        s3.addAll(s2);
        System.out.println(s3);

        //intere=section
        Set<Integer> s4 = new HashSet<>(s1);
        s4.retainAll(s2);
        System.out.println(s4);

        //Difference
        Set<Integer> s5 = new HashSet<>(s1);
        s5.removeAll(s2);
        System.out.println(s5);






    }
}
