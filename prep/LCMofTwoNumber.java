public class LCMofTwoNumber {
    static void main() {
        System.out.println(lcm(15, 25));
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }


    static int gcd(int a, int b) {
        int reminder;
        while (b != 0) {
            reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }
}
