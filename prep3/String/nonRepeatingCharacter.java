package String;

import java.util.LinkedHashMap;

public class nonRepeatingCharacter {
    static void main() {
        nonRepeatingCharacterChecker("strings");
    }


    public static void nonRepeatingCharacterChecker(String words) {
        char[] ch = words.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char cha : map.keySet()) {
            if (map.get(cha) <= 1) {
                System.out.println("First non repeating character is: " + cha);
                break;
            }
        }
    }
}
