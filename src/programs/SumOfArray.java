package programs;

public class SumOfArray {

    public static void main(String[] args){
        sumOfArray();
    }

    public static void sumOfArray(){
        int[] arr = new int[]{1,2,4,5,6,7};
        int sum=0;

        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array ::" + sum);
    }
}
