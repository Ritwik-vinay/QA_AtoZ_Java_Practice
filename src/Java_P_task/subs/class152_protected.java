package Java_P_task.subs;


import Java_P_task.main.accMod_validation;

public class class152_protected extends accMod_validation {
    public void protectedclass() {
        System.out.println(secNumber);
        accMod_validation.accMod_show();
    }
}

class parent_protected {
    public static void main(String[] args) {
        class152_protected clspro = new class152_protected();
        clspro.protectedclass();
    }
}
