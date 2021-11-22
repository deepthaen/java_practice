package Pratice;

public class OrderCreationTest {


    public static void main(String[] args){
        OrderCreation oc = new OrderCreation_Imp();
       String orderNo =  oc.createOrder();
        oc.sechudle(orderNo);
        oc.release(orderNo);
        String shipment = oc.createShipment(orderNo,2);
        System.out.println("Shipmet  " + shipment);


    }
}
