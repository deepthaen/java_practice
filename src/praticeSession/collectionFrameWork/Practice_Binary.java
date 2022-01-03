package praticeSession.collectionFrameWork;

import java.util.Arrays;

public class Practice_Binary {
     public static int search(int[] arr, int k){
         int start =0;
         int end = arr.length-1;
         int mid = (start+end)/2;
         while (start <=end){
              if(arr[mid] == k){
                  return mid;
              }else if(arr[mid] < k){
                  start = mid+1;
              }else {
                  end = mid-1;

              }
              mid = (start+end)/2;

         }





         return 0;

     }

    public static void main(String[] args) {
        int[] arr = {20,30,10,50,25,80,50};
        int k = 25;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
       int ans = search(arr,k);
        System.out.println("search element :" +ans);
    }
}
