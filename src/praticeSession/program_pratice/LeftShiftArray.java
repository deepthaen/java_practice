package praticeSession.program_pratice;

public class LeftShiftArray {

    public static void leftshift(){
        int[] arr = {2,3,5,8,9};
        int k = 3;
        int len = arr.length;

        for (int i = 0; i <= len; i++) {
            // display input
            System.out.print(arr[i]+ " ");

        }
        for (int i = 0; i <= k; i++) {

            for (int j = 0; j < len-1; j++) {
                arr[j] = arr[j+1];
                System.out.print(arr[j]);
            }
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        leftshift();
    }
}
