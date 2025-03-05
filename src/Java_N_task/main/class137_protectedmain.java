package Java_N_task.main;

public class class137_protectedmain {
    public static void main(String[] args) {
        display_protected_num dm = new display_protected_num();
    }
}

class display_protected_num extends protected_example {
    public void display_num() {
        System.out.println("i can access the protected number: " + number);
    }
}

class protected_example {
    protected int number = 67;
}
