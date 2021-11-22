package Pratice;

public abstract class OrderCreationAbstract {

    public abstract String createOrder();

    public void schedule(String order){
        System.out.println("Scedule order  "+ order);
    }

    public abstract void reliase(String order);

    public String createShipment(String order, int count){
        System.out.println("Order no " + order+ "  count "+ count);
        String Shipment = "SHIP-001";
        return Shipment;
    }
}
