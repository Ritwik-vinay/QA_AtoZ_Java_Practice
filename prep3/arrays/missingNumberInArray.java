package arrays;

import java.util.HashSet;
import java.util.Set;

public class missingNumberInArray {
    static void main() {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {3, 5, 6, 7, 8, 9};
        System.out.println(missingNumber(a1, a2));
    }

    static Set<Integer> missingNumber(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int n : arr1) set.add(n);
        for (int n : arr2) {
            if (!set.contains(n)) {
                result.add(n);
            }
        }
        return result;
    }
}
