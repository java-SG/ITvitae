package school.les;

import java.util.Scanner;

public class hoofdstuk_04_stringassigment {
    public static void main(String[] args) {
        /*
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
        if (word.toLowerCase().equals(palindrome.toLowerCase()) && word.length() > 1) {
            System.out.println("This word is also a palindrome");
        }
        */

            StringBuilder sb1 = new StringBuilder();
            sb1.append(true);
            sb1.append(10);
            sb1.append('a');
            sb1.append(20.99);
            sb1.append("Hi");
            System.out.println(sb1); // true10a20.99Hi

        StringBuilder sb2 = new StringBuilder("Bon");
        sb2.insert(2, 'r');
        System.out.println(sb2); // Born

        StringBuilder sb3 = new StringBuilder("123");
        char[] naam = {'J', 'a', 'v', 'a'};
        sb3.insert(1, naam, 1, 3);
        System.out.println(sb3); // 1ava23
        sb3.delete(1,2);
        System.out.println(sb3);
    }
}
