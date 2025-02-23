package Java_K_Task;

public class class112_throw {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);
        Bank jp_chase = new Bank("USD", 101);
//        int result = sbi.add(icici);;
        int result = sbi.add(jp_chase);
        ;
        System.out.println(result);
    }

}

class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) {
        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new CustomException("Currency Mismatch, Can't Proceed!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }


}

class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}
