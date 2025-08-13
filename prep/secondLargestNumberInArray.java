public class secondLargestNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 2, 7};
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for (int a : arr) {
            if (a > largestNumber) {
                secondLargestNum = largestNumber;
                largestNumber = a;
            } else if (a > secondLargestNum && a != largestNumber) {
                secondLargestNum = a;
            }
        }
        System.out.println(secondLargestNum);
    }
}
