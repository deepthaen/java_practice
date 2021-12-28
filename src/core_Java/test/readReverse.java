package core_Java.test;

public class readReverse {


        static int[] arr = {1, 2, 3, 4, 5, 6,7};

        public static void reverse(){
            for (int i = arr.length-1; i >0 ; i--) {
                System.out.println("reverse number :: "+arr[i]);

            }
        }

    public static void main(String[] args) {
        reverse();
    }

    public static void browserLaunch(String browser){

    }

    public static void launch(){
            browserLaunch("Chrome");
    }

}
