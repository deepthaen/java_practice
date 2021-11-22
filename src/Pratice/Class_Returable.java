package Pratice;

public class Class_Returable implements Interfcae_returnable{
    @Override
    public String college() {
        String s = "Random";
      //  System.out.println(s);
        return s;
    }

    @Override
    public int year(int i) {
        return 0;
    }


    //   @Override
 // public int year(String i) {
//        int i;
//        return i;
//        }



    public static void main(String[] args) {
        Interfcae_returnable ir = new Class_Returable();
       String c =  ir.college();
    }
}
