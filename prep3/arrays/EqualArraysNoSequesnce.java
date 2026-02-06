package arrays;

public class EqualArraysNoSequesnce {
    static void main() {
        int[] a = {1, 2, 3, 2, 4};
        int[] b = {1, 2, 2, 4, 3};
        System.out.println(noSequenceMatch(a, b));
    }


    static boolean noSequenceMatch(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (visited[i]) continue;
            int countA = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    countA++;
                    visited[j] = true;
                }
            }
            int countB = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    countB++;

                }
            }
            if (countA != countB) {
                return false;
            }

        }
        return true;
    }
}
