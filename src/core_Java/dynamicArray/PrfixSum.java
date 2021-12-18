package core_Java.dynamicArray;

public class PrfixSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int size  =arr.length;
        //classA a = new classA();
        int[] parr = new int[size];

        //[1,3,6,10,15]
        parr[0]=arr[0];
        for (int i = 1; i < size; i++) {
            parr[i]=arr[i-1]+arr[i]; // 1+2 , 2+3 , 3+4, 4+5
        }

    }
}
