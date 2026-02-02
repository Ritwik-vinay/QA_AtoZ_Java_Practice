package arrays;

public class smallestAndLargest {
    static void main() {
        int[] arr = {3, 4, 5, 6, 7, 22, 23, 25, 1, 8, 9, 10};
        smallestLargestArrayNum(arr);
    }

    static void smallestLargestArrayNum(int[] arr) {
        int max = arr[0];
        int min = arr[1];
        for (int arrnum : arr) {
            if (max < arrnum) {
                max = arrnum;
            } else if (min > arrnum) {
                min = arrnum;
            }
        }
        System.out.println(max + " is the max number");
        System.out.println(min + " is the min number ");
    }
}
