package Java_L_Task.maps;

import java.util.HashMap;

public class class122_hashmap {
    public static void main(String[] args) {
        //Unorganised way
        HashMap hs = new HashMap();
        hs.put("Name", "Ritwik");
        hs.put("Roll no", "21");
        hs.put("Subject", "Automation Java");
        hs.put("Teacher", "Pramod");
        System.out.println(hs);
        System.out.println(hs.values());
        System.out.println(hs.keySet());

    }
}
