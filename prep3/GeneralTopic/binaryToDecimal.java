package GeneralTopic;

public class binaryToDecimal {
    static void main() {
        System.out.println(binarytodecimalChecker("0111"));
    }

    static int binarytodecimalChecker(String b) {
        return Integer.parseInt(b, 2);
    }
}
