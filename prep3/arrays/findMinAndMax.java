package arrays;

public class findMinAndMax {
    static void main() {
        int[] arr = {2, 4, 5, 6, 1, 0, -1, 3};
        int max = maxNumber(arr);
        int min = minValue(arr);
        System.out.println(max + " max value");
        System.out.println(min + " min value");
    }

    static int maxNumber(int[] value) {
        int max = value[0];

        for (int i = 0; i < value.length; i++) {
            if (max < value[i]) {
                max = value[i];
            }
        }
        return max;
    }

    static int minValue(int[] value2) {
        int min = value2[value2.length - 1];
        for (int i = 0; i < value2.length - 1; i++) {
            if (min > value2[i]) {
                min = value2[i];
            }
        }
        return min;
    }
}
