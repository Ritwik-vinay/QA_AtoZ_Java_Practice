package Java_L_Task.lists;

import java.util.ArrayList;
import java.util.List;

public class class116_list_arraylist {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        //fruits1.add(133);
        System.out.println(fruits1);


        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);


        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);


        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegatables);
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(2));
        System.out.println("------------------merge");
        List fruits_details = new ArrayList();
        fruits_details.addAll(fruits1);
        fruits_details.addAll(fruits2);
        fruits_details.addAll(vegatables);
        System.out.println(fruits_details);

    }
}
