package Java_L_Task.maps;

import java.util.Map;
import java.util.TreeMap;

public class class124_Map_TreeMap {
    public static void main(String[] args) {
        Map m3 = new TreeMap();//Dynamic Dispatch concept
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m3.put("name", "pramod");
        m3.put("rollno", 1);
        m3.put("phone", 987654321);
        System.out.println(m3);

    }
}

