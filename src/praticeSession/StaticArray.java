package praticeSession;

import java.util.ArrayList;

class ArrayExample {

    public static void staticArray (){
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 9;
        System.out.println(arr[1]);
        int[] a = {2,3,6};
        System.out.println(a[2]);
    }

    public static void dynamicArray(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println(arr);
    }
    public static void main(String[] args) {
       staticArray();
       dynamicArray();


    }
}
