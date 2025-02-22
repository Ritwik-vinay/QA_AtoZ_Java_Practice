package Java_K_Task;

public class class105_encap {
    public static void main(String[] args) {
        goodlogin goodlogin_user = new goodlogin("admin", "admin123");
        goodlogin_user.setUsername("Admin1");
        System.out.println(goodlogin_user.getUsername());


    }
}

class login_puclic {
    String username;
    String password;

    login_puclic(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;

    }
}

class goodlogin {
    private String username;
    private String password;

    public goodlogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
}

