package dsAlgo.binarySearch;

public class BInarySearch {




    public static int binarySearch(int[] arr, int k){
        //int[] arr ={10,13,15,17,18,19,21};
        //int k=15;
        int start=0; // 0
        int end =arr.length-1; // 7-1 = 6
        int mid= (start+end)/2; // (0+6)/2 = 3
        while (start<=end){// 0<=6  -- 0 <=2  -- 1 <= 2
            if(arr[mid]==k){// 17 ==15(N0)  -- 13 == 15(No)  - 15 == 15
                return mid; //
            }else if(arr[mid]<k){// 17<15  13<15
                start=mid+1; // 0+1 = 1 --
            }else{
                end=mid-1; //  3-1 = 2
            }
            mid=(start+end)/2;// 0+2/2 = 1 -- (1+2)/2 ==2 --
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr ={10,13,15,17,18,19,21};
        int k=15;
       int ans =  binarySearch(arr,k);
        System.out.println(ans);
    }

}
