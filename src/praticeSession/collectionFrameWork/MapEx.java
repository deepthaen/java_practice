package praticeSession.collectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

    public void mapExample(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Deep",1);
        map.put("Ram", 2);
        map.put("Rim", 3);
        map.put("Lim", 4);
        map.put("Dim", 5);
       int i = map.size();
        System.out.println(i);
        System.out.println(map);

        for (Map.Entry m: map.entrySet() ){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }


    public static void main(String[] args) {
        MapEx m = new MapEx();
        m.mapExample();

    }
}
