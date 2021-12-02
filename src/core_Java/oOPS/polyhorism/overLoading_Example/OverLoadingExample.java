package core_Java.oOPS.polyhorism.overLoading_Example;

public class OverLoadingExample {

    public void placeOrder(String Itemid, int qty){
        System.out.println("SLSQ");
    }
    public void placeOrder(String Itemid, int qty, String Payment){
        System.out.println("SLSQ with COD");
    }

    public void placeOrder(String Itemid){
        System.out.println("place order");
    }


}
