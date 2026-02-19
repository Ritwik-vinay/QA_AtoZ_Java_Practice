package GeneralTopic;

public class maxNumberbetweenTwo {
    static void main() {
        System.out.println(maxChecker(13, 18));
        System.out.println(maxChecker(13, 19, 17));
    }

    static int maxChecker(int a, int b) {
        return Math.max(a, b);
    }

    static int maxChecker(int a, int b, int c) {
        return Math.max(a, Math.max(a, b));
    }
}
