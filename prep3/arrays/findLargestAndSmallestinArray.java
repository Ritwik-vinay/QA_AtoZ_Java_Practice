package arrays;

public class findLargestAndSmallestinArray {
    static void main() {
        int[] arr = {2, 3, 4, 1, 6, 5, 0};
        smallesLargestNumber(arr);
    }

    static void smallesLargestNumber(int[] a) {
        int largrestNumber = a[0];
        int smallestNumber = a[a.length - 1];

        for (int num : a) {
            if (largrestNumber < num) {
                largrestNumber = num;

            }
            if (smallestNumber > num) {
                smallestNumber = num;

            }
        }
        System.out.println(smallestNumber + "  - >Smallest number");
        System.out.println(largrestNumber + " -> largest Number");
    }
}


