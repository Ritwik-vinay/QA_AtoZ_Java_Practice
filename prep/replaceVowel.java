public class replaceVowel {
    public static void main(String[] args) {
        String input = "Name";
        input = input.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char arrayInput[] = input.toCharArray();
        for (char arraychar : arrayInput) {
            if (arraychar == 'a' || arraychar == 'e' || arraychar == 'i' || arraychar == 'o' || arraychar == 'u') {
                sb.append('x');
            } else {
                sb.append(arraychar);
            }

        }
        System.out.println(sb.toString());
    }
}
