package praticeSession;

public class TryCatchFinally {

    public static void trycatch(){
        try {
            System.out.println("try block");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Exeception Occured ");
        }finally {
            System.out.println("Always executve");
        }
    }

    public static void exceptionBlock(){
        int[] arr = new int[4];

        try
        {
            int i = arr[4];

            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }

        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }

        finally
        {
            System.out.println("finally block executed");
        }

    }
    public static void main(String[] args) {
        trycatch();
        exceptionBlock();
    }
}
