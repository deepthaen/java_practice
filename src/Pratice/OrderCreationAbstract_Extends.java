package Pratice;

public class OrderCreationAbstract_Extends extends OrderCreationAbstract{
    @Override
    public String createOrder() {
        String OrderNo = "Order NO :001";
        return OrderNo;
    }

    @Override
    public void reliase(String order) {
        System.out.println("Reliase  " + order );

    }
}
