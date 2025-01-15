package java_B;

import java.util.Scanner;

public class class14 {
    public static void main(String[] args) {
        //reversing the word

        String original = "Sharing is Caring";
        String reverseString = new StringBuffer(original).reverse().toString();
        System.out.println(reverseString);
        StringBuilder revSentence = new StringBuilder();

        //Reversing the sentence without reversing the word
        String[] word = original.split(" ");
        for (int i= word.length-1; i>=0;i--)
        {
            revSentence.append(word[i]);
            if(i!=0){
                revSentence.append(" ");
            }
        }
        System.out.println(revSentence.toString());

    }
}
