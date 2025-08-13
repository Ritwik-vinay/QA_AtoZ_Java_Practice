public class missingNumberArray {
    public static void main(String[] args) {
        int[] arr = {11, 12, 14, 15, 16};
        int totalsum = 0;
        int arrSum = 0;
        for (int i = 11; i <= 16; i++) {
            totalsum = totalsum + i;
        }
        for (int j = 0; j <= arr.length - 1; j++) {
            arrSum = arrSum + arr[j];
        }
        System.out.println(totalsum - arrSum);
    }
}
