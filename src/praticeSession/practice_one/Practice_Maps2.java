package praticeSession.practice_one;

import java.util.HashMap;
import java.util.Map;

public class Practice_Maps2 {


    public static void maps(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Deeptha", 20);
        map.put("Deep",30);
        map.put("Dee", 40);

        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+ " "+ m.getValue());
        }
    }

    public static void main(String[] args) {
        maps();
    }
}
