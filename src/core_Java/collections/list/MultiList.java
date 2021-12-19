package core_Java.collections.list;

import java.util.ArrayList;
import java.util.List;

public class MultiList {

    public static List<Integer> cseList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }
    public static List<Integer> eceList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }
    public static List<Integer> eeeList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }
    public static List<Integer> mechList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }
    public static List<Integer> civilList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }
    public static List<Integer> itList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }


    public static void main(String[] args) {
        List<Integer> cse = cseList();
        List<Integer> ece =  eceList();
        List<Integer> eee =  eeeList();
        List<Integer> mech =  mechList();
        List<Integer> civil =  civilList();
        List<Integer> it =  itList();

        List<List<Integer>> list= new ArrayList<>();
        list.add(cse);
        list.add(ece);
        list.add(eee);


        System.out.println(list);

    }
}
