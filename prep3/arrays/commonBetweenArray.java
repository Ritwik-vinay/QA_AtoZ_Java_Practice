package arrays;

import java.util.HashSet;
import java.util.Set;

public class commonBetweenArray {
    static void main() {
        //Find common elements between two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        Set<Integer> commonElements = commonBetweenArray(array1, array2);
        System.out.println(commonElements + " common Elements");
    }

    static Set<Integer> commonBetweenArray(int[] arr, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        for (int num : arr) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }
        return commonSet;
    }
}
