package core_Java.basicCocepts.conditions;

public class IfelseConditions {
    /**
     * use if else and write logic
     */

    public static void ifelsecond(int a, int b){

        if(a<b){
            System.out.println("a is less");

        }else {
            System.out.println("a is greater");

        }


    }
    /**
     * use if else if - nested if else
     *
     * // 5 min ok and write logic
     */
    public static void ifelseifcond(int a, int b, int c){

        if(a<b){
            System.out.println("a is less");
        }else if(b<c){
            System.out.println("b is less");
        }
        else {
            System.out.println("c is less");
        }
    }

    public static void main(String[] args) {
        ifelsecond(4, 7);
        ifelseifcond(10,4,1);
    }
    //can u hear
}
