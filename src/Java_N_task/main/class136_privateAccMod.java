package Java_N_task.main;

public class class136_privateAccMod {
    public static void main(String[] args) {
        displaynum number = new displaynum();
        number.display_secretnumber();
    }
}

class displaynum extends secretnumber {
    void display_secretnumber() {
        System.out.println("Secret number is : " + getSecretNumber());
    }


}

class secretnumber {
    private int secretNumber = 34;

    // without getter i can't be able to access the private member
    public int getSecretNumber() {
        return secretNumber;
    }


}
