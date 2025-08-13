public class reversetheInteger {
    public static void main(String[] args) {

        int x = 214748367;
        int rev = 0;
        int lastdigit;


        while (x != 0) {
            lastdigit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && lastdigit > 7) {
                System.out.println(0);
                System.exit(0);
            }
            if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE / 10 && lastdigit < -8) {
                System.out.println(0);
                System.exit(0);
            }
            rev = rev * 10 + lastdigit;
            x = x / 10;
        }

        System.out.println(rev);
    }
}