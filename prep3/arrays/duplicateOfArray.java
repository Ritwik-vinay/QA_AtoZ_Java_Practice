package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateOfArray {
    static void main() {
        int[] arr = {1, 2, 2, 3, 4, 3};
        duplicateArrayCheckerWithBuiltInMethod(arr);
    }


    static void duplicateArrayCheckerWithBuiltInMethod(int[] arr) {
        Set<Integer> setarr = new LinkedHashSet<>();
        for (int a : arr) {
            setarr.add(a);
        }
        System.out.println(setarr);
    }
}
