package arrays;

public class ArrayMissingNumber {
    static void main() {
        int[] arr = {1, 2, 3, 5};
        System.out.println(missingNumber(arr));
    }


    static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int sum : arr) {
            arraySum += sum;
        }
        return totalSum - arraySum;
    }
}
