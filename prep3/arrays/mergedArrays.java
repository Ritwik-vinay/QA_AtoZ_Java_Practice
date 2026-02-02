package arrays;

import java.util.Arrays;

public class mergedArrays {
    static void main() {
        int[] a = {1, 3, 5};
        int[] b = {2, 4};
        int[] result = returnMergerdArrays(a, b);
        Arrays.sort(result);
        String res = Arrays.toString(result);
        System.out.println(res);
    }

    static int[] returnMergerdArrays(int[] a, int[] b) {
        int[] mergedArr = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            mergedArr[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            mergedArr[index++] = b[i];
        }
        return mergedArr;
    }
}
