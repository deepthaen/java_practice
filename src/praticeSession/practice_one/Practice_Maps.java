package praticeSession.practice_one;


import java.util.HashMap;
import java.util.Map;

public class Practice_Maps {

    public void maps(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Deep", 10);
        map.put("D", 11);
        map.put("De", 12);
        map.put("Deept", 14);
        map.put("Deepth", 15);

        for (Map.Entry me :map.entrySet()) {
            System.out.println(me.getKey() + "  "+me.getValue());

        }
    }

    public static void main(String[] args) {
        Practice_Maps m = new Practice_Maps();
        m.maps();
    }
}
