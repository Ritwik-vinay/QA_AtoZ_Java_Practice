package arrays;

import java.util.Arrays;

public class DupeArray {
    static void main() {
        int[] arr = {4, 4, 5, 6, 5, 3, 5, 1};
        System.out.println(DupeArrayWithoutInbuilt(arr));
    }

    static String DupeArrayWithoutInbuilt(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            boolean isDupe = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) {
                    isDupe = true;
                    break;
                }
            }
            if (!isDupe) {
                temp[size] = arr[i];
                size++;
            }
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }
        return Arrays.toString(result);
    }
}
