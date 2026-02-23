package arrays;

public class sortArrayElement {
    static void main() {
        int[] a1 = {1, 3, 4, 2, 8, 7, 6};
        sortArray(a1);
        for (int num : a1) {
            System.out.print(num + " ");
        }
    }

    static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int midArray = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[midArray]) {
                    midArray = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[midArray];
            arr[midArray] = temp;
        }
    }
}
