package arrays;

public class sumOnlyInterger {
    static void main() {
        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
        int sum = sumElemenet(array);
        System.out.println(sum + " sum of elements");
    }

    static int sumElemenet(String[] array) {
        int sum = 0;
        for (String element : array) {
            try {
                int num = Integer.parseInt(element);
                sum += num;
            } catch (NumberFormatException e) {

            }
        }
        return sum;
    }
}
