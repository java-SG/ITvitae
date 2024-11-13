package school.opdrachten;

import java.util.Scanner;
import java.util.Arrays; // Not necessary?

public class caesars_code {
    public static void main(String[] args) {
        // Declared and initialized variables for following code, unless declared after input
        // Imported and/or used internal methods
        Scanner input = new Scanner(System.in); // Scanner for input
        StringBuilder encryptedWord = new StringBuilder(); // To build the final string
        //Constants
        final int lowerCase_FIRST = 97; // Could also just be added as value directly, but i prefer this in this case, also if other ascii arrays are to be added later like numbers or special symbols
        final int upperCase_FIRST = 65; // Same as above
        final int shift_MAX_CHAR = 26; // Because this code represents the max value for the alphabet, for numbers it would have to shift to shift_MAX_NUM = 10 with the code changed to Character.isNumber(inputArray[countChar]) or something, for later!
        // Other variables
        int shiftInt = 0; // The value of the amount of characters shifted on the ASCII table as integer
        String inputWord = ""; // for testing use = abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ
        String loopMessage = ""; // Added to string for while loop about input being out of boundaries
        boolean i = true; // Boolean to break the while loop for input if input is out of boundaries

        // First input for the word
        System.out.println("Enter a word to encrypt using Ceasar's Coding system");
        inputWord = input.nextLine();

        while (i) {
            System.out.println(loopMessage + "Enter the shifted value to use in Ceasar's Coding system (integer between 0 and 26)");
            shiftInt = input.nextInt();

            // Validate shiftInt (0 <= shiftInt <= 26)
            if (shiftInt < 0 || shiftInt > 26) {
                i = true;
            } else {
                i = false;
            }

            // Rebuilds first printed message while i remains false but expresses as "" initially, so is only expressed with the following text if i=false at least once
            loopMessage = "The value input exceeds the boundaries. ";
        }

        // Declared char for next in inputArray[]
        char inputArray[] = inputWord.toCharArray();

        for (int countChar = 0; countChar < inputArray.length; countChar++) {
            // Declared char for currect char in next in inputArray[]
            char currentChar = inputArray[countChar];
            if (Character.isLowerCase(currentChar)) {
                // Rotate within 'a' to 'z'
                encryptedWord.append((char) (lowerCase_FIRST + (currentChar - lowerCase_FIRST + shiftInt) % shift_MAX_CHAR));
            } else if (Character.isUpperCase(currentChar)) {
                // Rotate within 'A' to 'Z'
                encryptedWord.append((char) (upperCase_FIRST + (currentChar - upperCase_FIRST + shiftInt) % shift_MAX_CHAR));
            } else {
                // Any character that's not within the lowerCase nor uppercase alphabet is added without shifting or unencrypted
                encryptedWord.append(currentChar);
            }
        }
        System.out.println("The original word is [" + inputWord + "] and the encrypted word with n=" + shiftInt + " is [" + encryptedWord + "].");
    }
}

/* The code below was the first attempt, before applying the modulo method to create a loop on a range of chars

package school.opdrachten;

import java.util.Scanner;
import java.util.Arrays;

public class caesars_code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to encrypt using Ceasar's Coding system");
        String input_word = input.nextLine();
        char input_array[] = input_word.toCharArray();

        System.out.println("Enter the value for n to use in Ceasar's Coding system (integer)");
        int n = input.nextInt();

        // String chckLower = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String original_word = "";
        String encrypted_word = "";

/* Mostly this next code rewritten because this approach required more nested ifs to account for the upperCase issue past shiftInt=7,
which caused issues only due to there being 6 integers between upperCase and lowerCase on the ASCII table
 *//*
        for (int i = 0; i < input_array.length; i++) {
            int z = input_array[i] + n;
            char ascii_chck = ' ';
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
                    ascii_chck = Character.toUpperCase(t);
                } else {
                    // Do nothing
                }
                if (Character.isLetter(t) == Character.isLetter(ascii_chck)) {
                    encrypted_word = encrypted_word + t;
                } else {
                    encrypted_word = encrypted_word + input_array[i];
                }
            }
        }
        System.out.println("The original word is: \"" + input_word + "\" and the encrypted word, while n=" + n + " is: \"" + encrypted_word + "\".");
    }
}
 */