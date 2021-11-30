package core_Java.Pratice;

public class OrderCreationAbstractinExecution {

    public static void main(String[] args){
        OrderCreationAbstract oca = new OrderCreationAbstract_Extends();
        String orderNO = oca.createOrder();
        oca.schedule(orderNO);
        oca.reliase(orderNO);
       String ship=  oca.createShipment(orderNO,3);
        System.out.println("Shipment no "+ ship);



    }
}
