package school.les;

import java.util.Scanner;
import java.util.Arrays;

public class hoofdstuk_05_eindopdracht {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringMap = "abcdefghijklmnopqrstuvwxyz 0123456789"; // I put the space before the numbers because otherwise it doesnt seem to be there visually in the console, but any other will remain functional
        StringBuilder inputString = new StringBuilder();
        System.out.println("What is your input? Only Characters (a-z and A-Z) and Numbers (0-9) allowed");
        boolean inputValid = false;
        while (!inputValid) {
            inputString = new StringBuilder(input.nextLine());
            if (String.valueOf(inputString).matches("[a-zA-Z0-9 ]+")) {
                inputValid = true;
            } else {
                System.out.println("Try again, Only Characters (a-z and A-Z), Numbers (0-9) and empty spaces allowed");
            }
        }

        String trimmedString = String.valueOf(inputString);
        StringBuilder reverseString;
        int nWords = 1;
        int nVowels = 0;
        int nConsonants = 0;
        int nNumbers = 0;

        // String polishing start
        // Trims all double spaces down to a single space for each part of the String that contained multiple spaces
        for (int i = 0; i < inputString.length() && trimmedString.contains("  "); i++) {
            trimmedString = trimmedString.replace("  ", " ");
        }

        // Counts number of words based on amount of spaces found, nWords = 1 by default because it's always 1 word and only executes if there is any input
        for (int i = 0; i < trimmedString.length(); i++) {
            if (Character.toString(trimmedString.charAt(i)).equals(" ")) {
                nWords++;
            } else if (Character.toString(trimmedString.charAt(i)).toLowerCase().matches("[aeuioy]")) {
                nVowels++;
            } else if (Character.toString(trimmedString.charAt(i)).matches("[0-9]")) {
                nNumbers++;
            } else {
                nConsonants++;
            }
        }

        // Wipes the remaining spaces off trimmedString, then reverses it for reverseString
        for (int i = 0; i < inputString.length() && trimmedString.contains(" "); i++) trimmedString = trimmedString.replace(" ", "");
        reverseString = new StringBuilder(trimmedString).reverse();
        // String polishing end

        System.out.println("Original String was " + inputString.length() + " characters long of which " + (inputString.length() - trimmedString.length()) + " were spaces.");
        System.out.println("Consists of: " + nVowels + " vowels, " + nConsonants + " consonants and " + nNumbers + " numbers.");
        System.out.println("Number of words: " + nWords);
        System.out.println("Your String is " + ((trimmedString.equalsIgnoreCase(String.valueOf(reverseString))) ? "" : "not ") + "a palindrome.");

        // Set array map
        char[] arrayMap = new char[stringMap.length()];
        int[] arrayCount = new int[stringMap.length()];
        int maxUniqueChar = 0;
        for (int i = 0; i < stringMap.length(); i++) {
            arrayMap[i] = stringMap.charAt(i);
            for (int n = 0; n < inputString.length(); n++) {
                if (String.valueOf(inputString).toLowerCase().charAt(n) == arrayMap[i]) {
                    arrayCount[i]++;
                }
                maxUniqueChar = (maxUniqueChar < arrayCount[i]) ? arrayCount[i] : maxUniqueChar;
            }
        }

        // Determine max array height according to most common character
        StringBuilder asterixTable = new StringBuilder();
        char[][] arrayAsterix = new char[maxUniqueChar][stringMap.length()];
        for (int i = 0; i < maxUniqueChar; i++) {
            Arrays.fill(arrayAsterix[i], '-');
        }

        // Build *'s per character
        for (int i = 0; i < stringMap.length(); i++) {
            for (int n = maxUniqueChar - 1; n >= 0; n--) {
                    arrayAsterix[n][i] = (arrayCount[i] < (maxUniqueChar - n)) ? ' ' : '*';
            }
        }

        // Print array of * then print arrayMap
        for (int i = 0; i < maxUniqueChar; i++) {
            for (int n = 0; n < stringMap.length(); n++) {
                asterixTable.append(arrayAsterix[i][n] + ((n < stringMap.length() - 1) ? " " : (i < maxUniqueChar - 1) ? "\n" : ""));
            }
        }
        System.out.println(asterixTable);

        /*
        // This loop shows how much of each Char in arrayMap exist
        for (int i = 0; i < stringMap.length(); i++) {
            System.out.print(arrayCount[i] + ((i < stringMap.length() - 1) ? " " : "\n"));
        }
        */

        for (int i = 0; i < stringMap.length(); i++) {
            System.out.print(arrayMap[i] + ((i < stringMap.length() - 1) ? " " : ""));
        }

    }
}
