package arrays;

import java.util.Arrays;

public class revTheArr {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        arrReverse(arr);
    }

    static void arrReverse(int[] arr) {
        int[] revArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(revArr));
    }
}
