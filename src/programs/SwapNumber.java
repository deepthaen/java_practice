package programs;

public class SwapNumber {
    public static void main(String[] args) {
        swap();
        withoutThirdVar();
    }

    /**
     *  i  initialized a=8, b=3
     *  i will take temp variable to store result
     *  dry run
     *      now i will map a in temp => temp =a ===> temp=8
     *      now i will map b in a  ==? a=b   ===? a =3
     *      now i agaim map temp in b==> b= temp ==> b =8
     */
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

    /**
     * a =a+b => a=8+3 = 11
     * b =a-b => b=11-3= 8
     * a =a-b => 11-8 = 3
     */
    public static void withoutThirdVar(){
        int a=8, b=3;

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swap number a: "+ a );
        System.out.println("After Swap number b: "+ b );
    }
}
