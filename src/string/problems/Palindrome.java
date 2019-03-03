package string.problems;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String original, reverse = "";

        original = "mom";
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String isn't a palindrome.");
    }
}


