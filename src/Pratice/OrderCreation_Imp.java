package Pratice;

public class OrderCreation_Imp implements OrderCreation{
    @Override
    public String createOrder() {
        String order = "Random****";  //O1,O2, O3, O4
        return order;
    }

    @Override
    public void sechudle(String order) {
        System.out.println("Secduleing Order " +order);

    }

    @Override
    public void release(String order) {
        System.out.println("Relasing Order " +order);

    }

    @Override
    public String createShipment(String orderNo, int count) {
        System.out.println("Creating shipment with order number  " + orderNo+ " with count  " + count);
        String shipment = "SHI-001";
        return shipment;
    }
}
