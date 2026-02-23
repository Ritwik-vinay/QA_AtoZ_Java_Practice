package arrays;

import java.util.HashSet;
import java.util.Set;

public class subsetChecking {
    static void main() {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {3, 4};
        System.out.println(isSubSet(a1, a2));
    }

    static boolean isSubSet(int[] a1, int[] a2) {
        Set<Integer> set = new HashSet<>();
        for (int n : a1) set.add(n);
        for (int n : a2) {
            if (!set.contains(n)) return false;
        }
        return true;
    }
}
