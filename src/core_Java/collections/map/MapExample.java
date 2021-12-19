package core_Java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hari");
        map.put(2,"Deeptha");
        map.put(2,"lollu");
        System.out.println(map);
    }

}
