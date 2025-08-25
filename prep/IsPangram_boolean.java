import java.util.HashSet;

public class IsPangram_boolean {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = checkPangram(input);
        if (result) {
            System.out.println("It is a pangram");
        } else {
            System.out.println("It is Not a Pangram!!!!");
        }
    }

    private static boolean checkPangram(String input) {
        HashSet<Character> charaterSet = new HashSet<>();
        char charArray[] = input.toLowerCase().toCharArray();
        for (char c : charArray) {
            if (Character.isLetter(c)) {
                charaterSet.add(c);
            }
        }
        if (charaterSet.size() == 26) {
            return true;
        }
        return false;
    }
}
