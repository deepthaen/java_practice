package core_Java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class FetchCseDeatils {

    public static void main(String[] args) {
        HashMap<String,String> mclassMap = new HashMap<>();

        Map<String,HashMap<String,String>> map = new HashMap<>();

        ClassInfo info = new ClassInfo();

        map.put("hari",mclassMap);
        map.put("deptha",mclassMap);
    }
}
