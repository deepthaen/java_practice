package core_Java.constructor_1.sample2;

public class Engine {

    String currentdriver; // i need some driver, but i dono who is it
    //Webdriver driver;

    Engine(String upComingDriver){
        this.currentdriver=upComingDriver;
        System.out.println("driver assigned for today :: "+currentdriver);
    }

    /**
     * Engine(Webdriver driver){
     *     this.driver = driver;
     * }
     */


    public void audiEngine(){
        //driver.find.click()
        System.out.println(currentdriver+"==> driving audi car");
    }

    public void rangeRoverEngine(){
        //driver.find.send();
        System.out.println(currentdriver +"==> Driving Rangerover car");
    }

}
