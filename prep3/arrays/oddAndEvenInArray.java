package arrays;

public class oddAndEvenInArray {
    static void main() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] count = oddAndEvenArray(array);
        System.out.println(count[0]);
        System.out.println(count[1]);

    }


    static int[] oddAndEvenArray(int[] arr) {
        int[] count = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count[1]++;
            } else {
                count[0]++;
            }
        }
        return count;

    }
}
