package arrays;

import java.util.HashSet;
import java.util.Set;

public class removeDupe {
    static void main() {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 5, 6, 3, 7};
        System.out.println(removeDuplicate(a, b));
    }


    static Set<Integer> removeDuplicate(int[] arr1, int[] arr2) {
        Set<Integer> unique = new HashSet<>();

        for (int n : arr1) {
            unique.add(n);
        }
        for (int n : arr2) {
            unique.add(n);
        }
        return unique;
    }

}

