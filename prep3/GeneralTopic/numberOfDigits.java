package GeneralTopic;

public class numberOfDigits {
    static void main() {
        System.out.println(numberOfDigitsvalue(159654));
    }

    static int numberOfDigitsvalue(int n) {

        return String.valueOf(Math.abs(n)).length();
    }
}
