public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "1ab2";
        char inputArray[] = s.toCharArray();
        int leftPointer = 0;
        int rightPointer = inputArray.length - 1;
        while (leftPointer < rightPointer) {
            if (!Character.isLetter(inputArray[leftPointer])) {
                leftPointer++;
            } else if (!Character.isLetter(inputArray[rightPointer])) {
                rightPointer--;
            } else {
                char temp = inputArray[leftPointer];
                inputArray[leftPointer] = inputArray[rightPointer];
                inputArray[rightPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }
        System.out.println(new String(inputArray));
    }
}
