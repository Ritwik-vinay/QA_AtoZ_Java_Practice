import java.util.HashMap;

public class CharacterOccurance {
    public static void main(String[] args) {
        String s = "madam";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        char inputString[] = s.toCharArray();
        int count = 0;
        for (char x : inputString) {
            frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
        }
        System.out.println(frequencyMap);
    }
}
