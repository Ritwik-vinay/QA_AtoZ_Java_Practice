package String;

import java.util.HashMap;

public class countEachWord {
    static void main() {
        countEachWordChecker("java is java and java is easy");
    }


    public static void countEachWordChecker(String input) {
        String[] words = input.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String w : map.keySet()) {
            if (map.get(w) >= 1) {
                System.out.println(w + " " + map.get(w));
            }
        }
    }
}
