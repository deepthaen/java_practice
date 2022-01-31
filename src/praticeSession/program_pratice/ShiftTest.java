package praticeSession.program_pratice;

import java.util.Arrays;

public class ShiftTest {


        public static void main(String args[]){
            int  [] arr = {1,2,3,4,5,6,7,8,9};
            int n = 2;
            System.out.println("Array "+Arrays.toString(arr));
          //  ShiftToRight(arr,n);

       // public static void ShiftToRight(int a[],int n){
            //Displays original array
            System.out.println("Original array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            //Rotate the given array by n times toward left
            for(int i = 0; i < n; i++){
                int j, first;
                //Stores the first element of the array
                first = arr[0];
                for(j = 0; j < arr.length-1; j++){
                    //Shift element of array by one
                    arr[j] = arr[j+1];
                }
                //First element of array will be added to the end
                arr[j] = first;
            }
            System.out.println();
            //Displays resulting array after rotation
            System.out.println("Array after left rotation: ");
            for(int i = 0; i< arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
}

