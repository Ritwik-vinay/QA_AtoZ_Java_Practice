public class Calculating_SumofArray {
    public static void main(String[] args) {
        int[] arr = {1, 22, 23, 34, 54, 55};
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
