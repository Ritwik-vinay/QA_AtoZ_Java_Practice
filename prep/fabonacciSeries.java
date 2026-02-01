public class fabonacciSeries {
    static void main() {
        fabonaciSeriesChecker(10);
    }

    static void fabonaciSeriesChecker(int n) {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
}
