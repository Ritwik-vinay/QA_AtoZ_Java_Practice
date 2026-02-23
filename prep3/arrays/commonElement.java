package arrays;

import java.util.HashSet;
import java.util.Set;

public class commonElement {
    static void main() {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {3, 4, 5, 6, 7};
        System.out.println(commonSetsElement(a1, a2));
    }

    public static Set<Integer> commonSetsElement(int[] a1, int[] a2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : a1) {
            set.add(num);
        }
        for (int num : a2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }
}
