package arrays;

public class sumOfAllElement {
    static void main() {
        int[] arr = {10, 5, 20, 8, 15};
        sumAllElement(arr);
    }

    static void sumAllElement(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
