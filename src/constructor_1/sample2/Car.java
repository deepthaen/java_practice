package constructor_1.sample2;

public class Car {


    public static void main(String[] args) {
        //Webdriver driver = new AudiCar();
        //Engine engine = new Engine(driver);

        String upComingdriver = "Harikrishna";
        Engine engine = new Engine(upComingdriver);
        engine.audiEngine();
        engine.rangeRoverEngine();
    }
}
