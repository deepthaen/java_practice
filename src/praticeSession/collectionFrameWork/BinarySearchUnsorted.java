package praticeSession.collectionFrameWork;

import programs.ArraySort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchUnsorted {

    public static int binaryUnsorted(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<= end){
            if(arr[mid] == k){
                return mid;

            }else if(arr[mid] < k){
                start = mid+1;
            }else{
                end = mid -1;
            }
            mid = (start+end)/2;

        }





        return 0;
    }


    public static void main(String[] args) {

        int[] arr = {30,20,10,50,25,55,11};
        int k = 25;
         Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }

       int i =  binaryUnsorted(arr, k);
        System.out.println(i);


    }
}
