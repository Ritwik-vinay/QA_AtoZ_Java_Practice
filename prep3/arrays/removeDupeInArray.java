package arrays;

import java.util.HashSet;
import java.util.Set;

public class removeDupeInArray {
    static void main() {
        int[] arr = {1, 3, 3, 2, 5, 2, 4};
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
