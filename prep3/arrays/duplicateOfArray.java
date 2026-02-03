package arrays;

import java.util.Set;
import java.util.TreeSet;

public class duplicateOfArray {
    static void main() {
        int[] arr = {2, 2, 3, 4, 3, 1};
        duplicateArrayCheckerWithBuiltInMethod(arr);
    }


    static void duplicateArrayCheckerWithBuiltInMethod(int[] arr) {
        Set<Integer> setarr = new TreeSet<>();
        for (int a : arr) {
            setarr.add(a);
        }
        System.out.println(setarr);
    }
}
