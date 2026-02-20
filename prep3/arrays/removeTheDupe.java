package arrays;

public class removeTheDupe {
    static void main() {
        int[] arr = {1, 2, 3, 3, 2, 4};
        dupeArray(arr);
    }


    public static void dupeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean dupe = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    dupe = true;
                    break;
                }
            }
            if (!dupe) {
                System.out.println(arr[i]);
            }
        }

    }
}
