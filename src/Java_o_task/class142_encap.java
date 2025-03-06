package Java_o_task;

public class class142_encap {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Ritwik");
        p.setage(29);
        System.out.println("Name is " + p.getName());
        System.out.println("Age is " + p.getage());
    }
}

class person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name_c) {
        if (name_c != null && !name_c.isEmpty()) {
            this.name = name_c;
        }
    }

    public int getage() {
        return age;
    }

    public void setage(int age_c) {
        if (age_c > 0) {
            this.age = age_c;
        }
    }
}
