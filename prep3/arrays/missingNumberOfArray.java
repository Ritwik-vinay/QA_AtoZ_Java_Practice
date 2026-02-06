package arrays;

public class missingNumberOfArray {
    static void main() {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        System.out.println(missingNumberInArray(arr, n));
    }


    static int missingNumberInArray(int[] arr, int n) {
        int expectedsum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedsum - actualSum;
    }
}
