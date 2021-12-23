package dsAlgo.maps;

import java.util.HashMap;
import java.util.Map;

public class MapsConcept {

    public void mapExe(){
        Map<String, Integer> m = new HashMap<>();
        m.put("Donkey",1);
        m.put("Monkey",2);
        m.put("Rat",3);
        int i = m.size();

        m.replace("Donkey",1,4);
        System.out.println("Size"+i);

        for (Map.Entry me: m.entrySet()) {
            System.out.println(me.getKey() + "  "+me.getValue());
        }
        
                
                
        }

    public static void main(String[] args) {
        MapsConcept mc = new MapsConcept();
        mc.mapExe();
    }
}
