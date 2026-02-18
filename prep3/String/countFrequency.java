package String;

import java.util.HashMap;

public class countFrequency {
    static void main() {
        String input = "java is java and java is easy";
        countFrequency(input);
    }


    public static void countFrequency(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (String word : map.keySet()) {
            if (map.get(word) >= 1) {
                System.out.println(word + " " + map.get(word));
            }
        }
    }
}

