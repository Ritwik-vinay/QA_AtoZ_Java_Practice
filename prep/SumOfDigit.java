public class SumOfDigit {
    static void main() {
        sumOfDigitChecker(123456);
    }


    static void sumOfDigitChecker(int number) {
        int digit = 0;
        int sum = 0;

        while (number != 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
