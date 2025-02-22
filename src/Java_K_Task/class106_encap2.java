package Java_K_Task;

public class class106_encap2 {
    public static void main(String[] args) {
        bank b = new bank(100, "rupees");
        b.setCurrency("USD");
        System.out.println(b.getCurrency());
        System.out.println(b.getMoney());
    }
}

class bank {
    private String currency;
    private int money;

    public bank(int money, String currency) {
        this.money = money;
        this.currency = currency;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}