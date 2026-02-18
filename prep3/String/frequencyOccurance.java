package String;

import java.util.HashMap;

public class frequencyOccurance {
    static void main() {
        frequencyOccurance("automation");
    }


    public static void frequencyOccurance(String s) {
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : map.keySet()) {
            if (map.get(c) >= 1) {
                System.out.println(c + " " + map.get(c));
            }
        }
    }
}
