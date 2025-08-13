public class moveTheZeroToTheEnd {
    public static void main(String[] args) {
        int[] num = {1, 0, 2, 0, 3, 0};
        int nonZeroPointer = 0;
        for (int currentPointer = 0; currentPointer <= num.length - 1; currentPointer++) {
            if (num[currentPointer] != 0) {
                int temp = num[nonZeroPointer];
                num[nonZeroPointer] = num[currentPointer];
                num[currentPointer] = temp;
                nonZeroPointer++;
            }
        }
        for (int no : num) {
            System.out.print(no);
        }

    }
}
