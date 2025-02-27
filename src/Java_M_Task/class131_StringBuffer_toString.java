package Java_M_Task;

public class class131_StringBuffer_toString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("RV");

        String st = new String(sb);
        System.out.println(st);

        String str = sb.append("My name is Ritwik").toString();
        System.out.println(str);
    }
}
