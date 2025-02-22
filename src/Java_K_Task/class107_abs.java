package Java_K_Task;

public class class107_abs {
    public static void main(String[] args) {
        indian_bank ib = new indian_bank();
        ib.details("rupees", 5000);
        System.out.println(ib.amt);
        System.out.println(ib.curr);
    }
}

class indian_bank extends bank_details {
    String curr;
    int amt;


    @Override
    void details(String currency, int amount) {
        this.curr = currency;
        this.amt = amount;
    }
}

abstract class bank_details {
    abstract void details(String currency, int amount);
}
