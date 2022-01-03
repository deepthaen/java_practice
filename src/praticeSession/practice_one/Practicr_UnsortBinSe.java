package praticeSession.practice_one;

import java.util.Arrays;

public class Practicr_UnsortBinSe {

    public  static int binarySearch(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while (start <= end){
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
        Practicr_UnsortBinSe b = new Practicr_UnsortBinSe();
        int[] arr = {34,20,40,60,33,50,60,80};
        int k = 34;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i]);
        }
       int ans = binarySearch(arr, k);
        System.out.println("Searched " + ans);
    }
}
