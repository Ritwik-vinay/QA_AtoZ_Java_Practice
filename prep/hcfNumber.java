public class hcfNumber {
    static void main() {
        System.out.println(hcf(9, 21));
    }

    static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }


    static int gcd(int a, int b) {
        int remainder = 0;
        while (b != 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
