package core_Java.Pratice;

public interface OrderCreation {


    public String createOrder();

    public void sechudle(String order);

    public void release(String order);

    public String createShipment(String orderNo, int count);
}
