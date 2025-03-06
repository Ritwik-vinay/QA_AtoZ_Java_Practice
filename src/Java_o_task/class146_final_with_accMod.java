package Java_o_task;

public class class146_final_with_accMod {
    public static void main(String[] args) {
        finalDemo finalDemo = new finalDemo();

        finalDemo.display_pub();

        finalDemo.display();
        finalDemo.dis_def();
        // finalDemo.disp_pvt();
    }
}

class finalDemo {
    public final int var_1 = 100;
    protected final int var_3 = 80;
    final int var_4 = 40;
    private final int var_2 = 50;

    public final void display_pub() {
        final int var1 = var_1;
        // var_1 = 220;
        // var1=220;
        System.out.println(var1);

    }

    protected final void display() {
        final int var3 = var_3;
        //var_3 = 220;
        //var3 = 220;
        System.out.println(var3);

    }

    private final void disp_pvt() {
        final int var2 = var_2;
        //var_2 = 220;
        //var2 = 220;
        System.out.println(var2);
    }

    final void dis_def() {
        int var4 = var_4;
        //var_4 = 220;
        //if the member is final then unable to assign new value
        var4 = 220;
        System.out.println(var4);
    }
}
