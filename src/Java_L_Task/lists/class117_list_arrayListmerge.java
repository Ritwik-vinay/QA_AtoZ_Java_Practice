package Java_L_Task.lists;

import java.util.ArrayList;
import java.util.List;

public class class117_list_arrayListmerge {
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
        System.out.println(fruits2);
        System.out.println(vegatables);
        System.out.println(fruits1);

    }
}
