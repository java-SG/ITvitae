package school.opdrachten;

import java.util.Scanner;
import java.util.Arrays;

public class caesars_code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to encrypt using Ceasar's Coding system, words only!");
        String input_word = input.nextLine();
        char input_array[] = input_word.toCharArray();

        System.out.println("Enter the value for n to use in Ceasar's Coding system (integer)");
        int n = input.nextInt();

        // String chckLower = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String original_word = "";
        String encrypted_word = "";

        for (int i = 0; i < input_array.length; i++) {
            int z = input_array[i] + n;
            if (Character.isLetter((char) z)) {
                char t = (char) (z);
                if (Character.isLetter(t)) {
                    encrypted_word = encrypted_word + t;
                } else {
                    encrypted_word = encrypted_word + input_array[i];
                }
            } else {
                char t = (char) (z - 26);
                if (Character.isLetter(t)) {
                    encrypted_word = encrypted_word + t;
                } else {
                    encrypted_word = encrypted_word + input_array[i];
                }
            }
        }
        System.out.println("The original word is: \"" + input_word + "\" and the encrypted word, while n=" + n + " is: \"" + encrypted_word + "\".");
    }
}
