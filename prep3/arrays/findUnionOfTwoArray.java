package arrays;

import java.util.HashSet;
import java.util.Set;

public class findUnionOfTwoArray {
    static void main() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7, 8};
        System.out.println(twoArrayUnion(arr1, arr2));
    }


    static Set<Integer> twoArrayUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr1) {
            set.add(n);
        }
        for (int n : arr2) {
            set.add(n);
        }

        return set;
    }
}
