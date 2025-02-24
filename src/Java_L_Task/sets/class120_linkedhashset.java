package Java_L_Task.sets;

import java.util.LinkedHashSet;

public class class120_linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("cat");
        lhs.add("dog");
        lhs.add("cow");
        lhs.add(56);
        lhs.add(true);
        System.out.println(lhs);
        for (Object setO : lhs) {
            System.out.println(setO);
        }
    }
}
