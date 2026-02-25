package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nonRepeatingInteger {
    static void main() {
        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
        List<Integer> result = printCommonElement(array);
        System.out.println("Non-repeated elements: " + result);

    }

    static List<Integer> printCommonElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> nonRepeatingElement = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeatingElement.add(entry.getKey());
            }
        }
        return nonRepeatingElement;
    }
}
