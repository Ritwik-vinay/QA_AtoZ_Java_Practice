public class missingNumberWithXOR {
    public static void main(String[] args) {
        int arr[] = {11, 12, 14, 15, 16};
        int missingNumber = 0;
        for (int i : arr) {
            missingNumber = missingNumber ^ i;
        }
        for (int j = 11; j <= 16; j++) {
            missingNumber = missingNumber ^ j;
        }
        System.out.println(missingNumber);
    }
}
