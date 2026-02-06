package arrays;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfElement {
    static void main() {
        int[] arr = {1, 2, 3, 2, 1, 4, 4, 4};
        elementFrequency(arr);
    }


    static void elementFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
