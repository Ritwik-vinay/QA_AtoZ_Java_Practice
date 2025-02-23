package Java_L_Task.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class class119_sets {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        fruits1.add("mango");


        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        fruits2.add("apple");


        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");


        List<String> fruit_details = new ArrayList<String>();
        fruit_details.addAll(fruits1);
        fruit_details.addAll(fruits2);
        System.out.println(fruit_details);
        Set sets = new HashSet();
        sets.addAll(fruit_details);
        System.out.println(sets);
    }
}
