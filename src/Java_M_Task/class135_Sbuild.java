package Java_M_Task;

public class class135_Sbuild {
    public static void main(String[] args) {

    }
}

class StringBuilderExample implements Runnable {
    StringBuilder sb = new StringBuilder("Hello");

    public static void main(String[] args) {
        StringBuilderExample obj = new StringBuilderExample();

        Thread t1 = new Thread(obj, "Thread-1");
        Thread t2 = new Thread(obj, "Thread-2");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sb.append(" World");
            System.out.println(Thread.currentThread().getName() + " -> " + sb.toString());
        }
    }
}

