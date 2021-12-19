package core_Java.collections.map;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Name","Deeptha");
        map.put("Name","Hari");
        map.put("somurl","som.ajio.com");
        map.put("dbname",null);
        map.put("uat","10.21.10.34");
        map.put(null,"10.21.10.34");
        System.out.println(map.get("uat"));

        for (Map.Entry<String,String> entry: map.entrySet()) {
            if(entry.getKey().equalsIgnoreCase("DataProvider")){
                if(entry.getValue().equalsIgnoreCase("YES")){

                }
            }
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}
