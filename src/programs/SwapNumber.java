package programs;

public class SwapNumber {
    public static void main(String[] args) {
        swap();
        withoutThirdVar();
    }

    public static void swap(){
        int a=8, b=3;
        int temp;

        System.out.println("Before swapping a :"+a);
        System.out.println("Before swapping b :"+b);
        temp = a;
        a= b;
        b= temp;

        System.out.println("After Swap number a: "+ a );
        System.out.println("After Swap number b: "+ b );

    }

    public static void withoutThirdVar(){
        int a=8, b=3;

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swap number a: "+ a );
        System.out.println("After Swap number b: "+ b );
    }
}
