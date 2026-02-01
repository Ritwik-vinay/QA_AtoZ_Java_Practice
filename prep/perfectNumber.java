public class perfectNumber {
    static void main() {
        perfectNumberChecker(10);
    }


    static void perfectNumberChecker(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a Perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
