package school.les;

import java.util.Scanner;

public class hoofdstuk_04_stringassigment {
    public static void main(String[] args) {
        // Get input and declare and initialize Strings
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String palindrome = "";

        // Loop String builds through every last character of input word as next reversed word char
        for (int i = 0; i < word.length(); i++) {
            palindrome += word.charAt((word.length()-1) - i);
        }

        // Test and result print of input, reverse and palindrome check
        System.out.println("Input word: " + word);
        System.out.println("Reversed word: " + palindrome);
        if (word.toLowerCase().equals(palindrome.toLowerCase())) {
            System.out.println("This word is also a palindrome");
        }
    }
}
