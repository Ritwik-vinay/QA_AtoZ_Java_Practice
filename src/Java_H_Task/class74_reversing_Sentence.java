package Java_H_Task;

public class class74_reversing_Sentence {
    public static void main(String[] args) {
        // Calculate the sum of numbers from 1 to 100
        String s = "This is india";
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();


        for (int i = s1.length - 1; i >= 0; i--) {
            sb.append(s1[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
