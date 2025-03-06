package Java_o_task;

public class class145_def_acc_mod {
    public static void main(String[] args) {
        defaccDemo dcdemo = new defaccDemo();
        dcdemo.defmethod("Ritwik");
    }

}

class defaccDemo {
    //default is Package_private access modifier
    String name;

    void defmethod(String name_c) {
        System.out.println(this.name = name_c);
    }
}