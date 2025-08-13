public class evenWordInString {
    public static void main(String[] args) {
        //Length of the string
        String str = "Sky is blue and Vast";
        //System.out.println(str.length());
        String[] str1 = str.split(" ");
        for (String i : str1) {
            if (i.length() % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println(" ");
            }

        }
    }
}
