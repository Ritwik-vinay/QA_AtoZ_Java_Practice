package arrays;

public class sortArrayWithoutInbuitMethod {
    static void main() {
        int[] arr = {1, 2, 5, 6, 9};
        System.out.println("Sorted");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    static void sortElementChecker(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int midIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[midIndex]) {
                    midIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex] = temp;
        }

    }
}
