package Java_M_Task;

public class class134_Strbuild_safe {
    public static void main(String[] args) {
        ThreadSafeStringBuilder safe = new ThreadSafeStringBuilder();
        safe.append("Hello");
        safe.append(" World");
        safe.append("!");
        System.out.println(safe.getString());
    }
}

class ThreadSafeStringBuilder {
    private StringBuilder sb = new StringBuilder();

    public synchronized void append(String str) {
        sb.append(str);
    }

    public synchronized String getString() {
        return sb.toString();
    }
}

