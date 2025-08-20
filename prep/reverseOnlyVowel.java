public class reverseOnlyVowel {
    public static void main(String[] args) {
        String input = "hello";
        //String outpit="Holle"
        String vowel = "AEIOUaeiou";
        char inputArray[] = input.toCharArray();
        int leftPointer = 0;
        int rightPointer = inputArray.length - 1;
        while (leftPointer < rightPointer) {
            // Bug: Second if condition checks leftPointer instead of rightPointer
            if (vowel.indexOf(inputArray[leftPointer]) == -1) {
                leftPointer++;
            } else if (vowel.indexOf(inputArray[rightPointer]) == -1) { // Fixed condition
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