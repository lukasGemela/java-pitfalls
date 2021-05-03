package f_list_iteration_removal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MapExample {

    public static void main(String[] args) {

        var map = new HashMap<String, String>();
        map.put("tiny", "tiny");
        map.put("little", "little");
        map.put("medium", "medium");

        for (final var strEntry : map.keySet()) {
            if (strEntry.equals("tiny")) {
                map.remove("tiny");
            }
        }

//        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
//        while(iter.hasNext()) {
//            final var entry = iter.next();
//            if (entry.getValue().equals("tiny")) {
//                iter.remove();
//            }
//        }
    }
}
