package GeneralTopic;

public class powOfNum {
    static void main() {
        System.out.println(powOfNumChecker(2, 3));
    }

    public static long powOfNumChecker(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res *= a;
            a *= a;
            b >>= 1;
        }
        return res;
    }
}
