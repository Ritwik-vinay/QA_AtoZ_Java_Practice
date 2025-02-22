package Java_K_Task;

public class class104_inheritance {
    public static void main(String[] args) {
        son s = new son();
        s.sonprop();
    }
}

class son extends father {

    void sonprop() {
        String sonProperty = property();
        System.out.println("i have" + sonProperty);
    }

}

class father {
    String property() {
        String prop = "50 KgGold";
        return prop;

    }
}


