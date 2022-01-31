package practiceSession2.dsAlogo;

import java.util.HashMap;
import java.util.Map;

public class MapsEx {

    public static void mapsEx(){
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Deep", 20);
        maps.put("Dee", 30);
      int i =  maps.size();
        System.out.println(maps);
        System.out.println(i);

        for (Map.Entry<String, Integer> m :maps.entrySet()) {
            if(m.getValue() == 20){
                System.out.println(m.getKey()+ ""+m.getValue());
            }


        }
    }

    public static void main(String[] args) {
        mapsEx();
    }
}
