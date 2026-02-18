package GeneralTopic;

public class saptwonumber {
    static void main() {
        int a = 5;
        int b = 10;
        int[] result = swap(a, b);
        ;
        for (int r : result) {
            System.out.println(r);
        }
    }

    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}
