package Java_K_Task;

public class class102_param_cons {
    public static void main(String[] args) {
        construct cons = new construct("Parameterized Constructor");

    }
}

class construct {
    String param;

    construct(String parameters) {
        this.param = parameters;
        System.out.println("I am a " + param);
    }
}
