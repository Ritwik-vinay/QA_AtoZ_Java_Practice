package Java_j_Task;

public class class100_getersetter {
    public static void main(String[] args) {
        goodvwologin glogin = new goodvwologin("admin", "pwd123");
        glogin.setUsername("Ritwik");
        System.out.println(glogin.getUsername());

    }
}

class vwoLogin {
    String username;
    String password;

    vwoLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }
}

class goodvwologin {
    private String username;
    private String password;

    public goodvwologin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
