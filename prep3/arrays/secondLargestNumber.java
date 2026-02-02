package arrays;

public class secondLargestNumber {
    static void main() {
        int[] arr = {3, 4, 5, 6, 7, 22, 23, 25, 1, 8, 24, 9, 10};
        System.out.println(secondlargestNumberChecker(arr));


    }

    static int secondlargestNumberChecker(int[] arr) {
//        Arrays.sort(arr);
//        return arr[arr.length-2];
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array should not be less than 2");
        }
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondmax = max;
                max = num;
            } else if (num > secondmax && num < max) {
                secondmax = num;
            }
        }
        if (secondmax == Integer.MIN_VALUE) {
            throw new RuntimeException("No Second largest number found ");
        }
        return secondmax;
    }
}
