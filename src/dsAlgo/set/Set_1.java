package dsAlgo.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_1 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(1);
        set.add(19);
        set.add(16);
        set.add(12);
        set.add(10);
        set.add(31);
        System.out.println(set);

        Integer[] ar = {3,6,7,4,1,2,9};
        set.addAll(Arrays.asList(ar));
        set.clear();
        System.out.println(set);

    }
}
