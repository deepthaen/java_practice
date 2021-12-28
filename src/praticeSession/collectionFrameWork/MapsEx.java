package praticeSession.collectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class MapsEx {

   public void mapsEx(){
       Map<String, Integer> maps = new HashMap<>();
       maps.put("Deep", 1);
       maps.put("Mys", 2);
       maps.put("Bng", 3);
       maps.put("Kar", 4);
       maps.replace("Deep", 6);
       maps.replace("Mys", 2,7);
       int s =maps.size();
       System.out.println("SIze"+s);

       for (Map.Entry m:maps.entrySet()) {
           System.out.println(m.getKey()+ " "+m.getValue());
       }
   }

    public static void main(String[] args) {
        MapsEx me = new MapsEx();
        me.mapsEx();

    }
}
