package arrays;

import java.util.Arrays;

public class arrayDuplicate {
    static void main() {
        int[] arr = {1, 2, 2, 3, 4, 3};
        System.out.println(dupArrayWithoutBuiltINMethod(arr));
    }

    static String dupArrayWithoutBuiltINMethod(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
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
