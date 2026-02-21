package arrays;

import java.util.*;

public class sortMap {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 5);
        map.put("C", 20);
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());
        list.sort((e1, e2)
                -> e1.getValue().compareTo(e2.getValue()));
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMap);
    }
}
