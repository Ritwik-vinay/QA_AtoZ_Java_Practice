public class lastwordLength {
    public static void main(String[] args) {
        String s = "  Hello World  moon   !! !  ";
        s = s.trim();
        int count = 0;
        char inputArray[] = s.toCharArray();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] != ' ' && inputArray[i] != '!') {
                count = count + 1;
            } else {
                if (count > 0) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
