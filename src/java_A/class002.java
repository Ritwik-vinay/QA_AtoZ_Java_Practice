package java_A;

public class class002 {
    public static void main(String[] args) {
        //without parameter and with return type
        class002 obj = new class002();
        int result = obj.return_type();
        System.out.println("Age is: " + result);


    }

    public int return_type() {
        int age = 29;
        return age;

    }
}
