package arrays;

import java.util.Arrays;

public class removeDuplicates {
    static void main() {
        int[] arr = {1, 2, 5, 3, 2, 4, 1,};
        removeDuplicatePreserveOrder(arr);
    }

    public static void removeDuplicatePreserveOrder(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            boolean isDupue = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDupue = true;
                    break;
                }
            }
            if (!isDupue) {
                System.out.println(arr[i] + " ");
            }
        }


    }
}
