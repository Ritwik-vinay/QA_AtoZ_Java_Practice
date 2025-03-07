package Java_P_task.main;

public class class148_decrea_accMod {
    public static void main(String[] args) {
        test test = new test();
        test.display();
    }
}

class test extends base {
    //@Override{ we can't override the private acc mod }
    public void display() {
        System.out.println("I am Public display");
    }
}

class base {
    private void display() {
        System.out.println("I am private display");
    }
}