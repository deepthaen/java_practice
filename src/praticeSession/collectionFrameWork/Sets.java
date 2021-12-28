package praticeSession.collectionFrameWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public void setExeample(Integer[] a2){
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(45);
        set.add(56);
        set.add(24);

        //System.out.println(set);
        // Print all - union of 2 arrays
        set.addAll(Arrays.asList(a2));
        System.out.println(set);

        // intersection of two arrays
        set.retainAll(Arrays.asList(a2));
        System.out.println(set);
        Set<Integer> set1 = new HashSet<>();
        //difference of two arrays
        set1.removeAll(Arrays.asList(a2));
        System.out.println(set);



    }



    public static void main(String[] args) {
        Sets s = new Sets();

        Integer[] a2 = {34,34,33,56,30,};
        s.setExeample(a2);
    }
}
