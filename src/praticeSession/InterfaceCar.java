package praticeSession;

public class InterfaceCar implements InterfaceVehcile, InterfaceOne{
    @Override
    public void vehicleType() {
        System.out.println("Audi");
    }

    @Override
    public String engine() {
        String s = "petrol";
        System.out.println(s);
        return s;
    }

    @Override
    public String model(String e) {
       String d = "A4";
        System.out.println(d);
        return d;
    }

    public static void main(String[] args) {
        InterfaceVehcile i = new InterfaceCar();
        i.vehicleType();
        String r = i.engine();
        i.model(r);
    }
}
