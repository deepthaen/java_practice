package core_Java.basicCocepts;

public class tryCatchFinally {

    public static void main(String[] args) {

        try{
            System.out.println("Try to get seat from IIT");
        }catch (Exception e){
            System.out.println("catch atleast IIM");
        }finally {
            System.out.println("Finally go to local college");
        }
    }
}
