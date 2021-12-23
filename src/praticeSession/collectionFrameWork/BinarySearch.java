package praticeSession.collectionFrameWork;

public class BinarySearch {

    public static int binary(int[] arr, int k){
        int start =0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                start = mid+1;
            }else{
                end = mid-1;
            }
             mid = (start+end)/2;
        }


        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 50;
        int ans =  binary(arr, k);
        System.out.println("Binary search "+ ans);



    }
}
