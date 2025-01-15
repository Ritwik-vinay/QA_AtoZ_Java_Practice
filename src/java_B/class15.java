package java_B;

public class class15 {
    public static void main(String[] args) {
        //How to indentify the vowels
        System.out.println("Does 'Hello' contain a vowel? " + containsVowel("Hello"));
        System.out.println("Does 'World' contain a vowel? " + containsVowel("World"));
        System.out.println("Does 'Rhythm' contain a vowel? " + containsVowel("Rhythm"));

    }
    public static boolean containsVowel(String input){
        return input.toLowerCase().matches(".*[a,e,i,o,u].*");
    }
}
