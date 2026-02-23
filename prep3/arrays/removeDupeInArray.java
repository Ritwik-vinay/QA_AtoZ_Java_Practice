package arrays;

import java.util.HashSet;
import java.util.Set;

public class removeDupeInArray {
    static void main() {
        int[] arr = {5, 2, 9, 1, 6, 2, 5};
        System.out.println(removeDupeValue(arr));
    }


    static Set<Integer> removeDupeValue(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        return set;
    }
}
