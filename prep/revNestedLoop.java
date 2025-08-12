public class revNestedLoop {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i < 5; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");

            }
        }


    }
}

