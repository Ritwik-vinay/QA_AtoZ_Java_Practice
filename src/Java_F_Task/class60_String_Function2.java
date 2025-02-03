package Java_F_Task;

public class class60_String_Function2 {
    public static void main(String[] args) {

        String name = "Ritwik Vinay";
        //String length
        int len = name.length();
        System.out.println(len);
        //Character AT>>Starts with 0th index
        System.out.println(name.charAt(5));
        //subString
        //The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
        System.out.println(name.substring(5, 11));
        //Concat addition of two Strings
        String n = name.concat(" is a Sr Automation Engineer");
        System.out.println(n);
        //equals>> string 1 should be equals String 2 identically equal
        String name1 = "Ritwik Vinay";
        System.out.println(name.equals(name1));
        //Equals Ignore Case>> compare 2 Strings that can be in different cases
        String name2 = "ritwik vinay";
        System.out.println(name.equalsIgnoreCase(name2));
        //to Uppercase>> Changes the String to Upper Case
        System.out.println(name.toUpperCase());
        //to LowerCase>> Changes the Strings to LowerCase
        System.out.println(name.toLowerCase());
        //trim >> it removed the Spaces from the String
        String name3 = " rv ";
        System.out.println(name3.trim());
        //replace> it replaces the char from old character to new Character
        System.out.println(n.replace('a', ' '));
        //StartsWith>> prefix
        System.out.println(name.startsWith("R"));
        //endswith>> suffix
        System.out.println(name.endsWith("y"));
        //contains>> compare the Strings with the sentense and returns true or false
        System.out.println(n.contains("is a Sr"));


    }
}
