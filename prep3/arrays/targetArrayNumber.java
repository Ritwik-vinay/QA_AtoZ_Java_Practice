package arrays;

public class targetArrayNumber {
    static void main() {
        int[] a = {5, 2, 9, 1, 6, 3};
        int target = 6;

        int index = sumOfArray(a, target);

        if (index != -1) {
            System.out.println("Element " + target + " found index" + index);
        } else {
            System.out.println("Element " + target + " index not found");
        }
    }


    static int sumOfArray(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
