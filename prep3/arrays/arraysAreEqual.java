package arrays;

public class arraysAreEqual {
    static void main() {
        int[] arr = {1, 2, 3};
        int[] arr1 = {3, 2, 1};
        System.out.println(arrayEqualChecker(arr, arr1));
    }

    static boolean arrayEqualChecker(int[] arr, int[] arr1) {

        if (arr.length != arr1.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            }
        }
        return true;
    }
}
