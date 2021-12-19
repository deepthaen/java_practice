package core_Java.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {

    public static void main(String[] args) {
        //List<Webelemnt> lelements = driver.findelements()
//        List<WebElement> listofSHipments = driver.findElements(By.xpath("//div[text()='Shipment ID']/../../../../div[2]/div"));
//        for (int i = 0; i < listofSHipments.size(); i++) {
//           String Shipment = driver.finelement(by.xpath("//div[text()='Shipment ID']/../../../../div[2]/div["+i+"]/div/div[2]"))
//        }


        List<Integer> lelements = new ArrayList<>();
        lelements.add(1);
        lelements.add(1);
        lelements.add(1);  lelements.add(1);
        lelements.add(1);

        for (int i = 0; i < lelements.size(); i++) {
            System.out.println(lelements.get(i));
        }
    }
}
