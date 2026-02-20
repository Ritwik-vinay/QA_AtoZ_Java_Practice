package GeneralTopic;

public class strongNumber {
    static void main() {
        System.out.println(isStrong(145));
    }

    private static int fact(int d) {
        int f = 1;
        for (int i = 2; i <= d; i++)
            f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }
}
