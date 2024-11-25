package school.games;

import java.util.Scanner;
import java.util.Arrays;

public class hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare variables
        String[] wordList = {"Memes", "Emojis", "Games"};
        String stringWord;
        String Guess = "";
        String validateGuesses = "";
        int matchCount = 0;
        int guessCount = 0;
        int livesLeft = 7;
        char[] arrayWord;
        char[] arrayHangman;
        char[] arrayGuesses = {' '};
        char[] guessesTemp = {' '};
        boolean turnEnd = false;
        boolean roundEnd = false;
        boolean gameEnd = false;
        boolean validGuess = false;

        System.out.println("Welcome to the game of Hangman!");
        System.out.println("You start with " + livesLeft + " lives per round, which will decrease by 1 every turn if there is no match\nand will end the game if it reaches 0 without completing the word, enjoy the game!");
        while (!gameEnd) {
            while (!roundEnd) {
                stringWord = "Memes";
                // for (int i = 1; i < stringWord.length(); i++) { // for loop unnecessary
                arrayWord = stringWord.toCharArray();
                // System.out.println("The word has been selected! " + stringWord + " > " + Arrays.toString(arrayWord)); // Enable this line to check what word is selected and test the arrayWord
                // }
                arrayHangman = new char[arrayWord.length];
                for (int i = 0; i < arrayWord.length; i++) {
                    arrayHangman[i] = arrayWord[i];
                }
                for (int i = 0; i < arrayHangman.length; i++) {
                    arrayHangman[i] = '*';
                    // System.out.println(arrayHangman); // Enable to see the array get converted step by step
                }
                System.out.println("The hangman word currently is: " + Arrays.toString(arrayHangman));
                System.out.println("Please provide a guess:");
                // Each round starts here, loops every turn and only breaks when either arrayHangman=arrayWord or the livesLeft reaches 0 without arrayHangman=arrayWord
                while (!turnEnd) {
                    Guess = input.nextLine();
                    Guess = Guess.toLowerCase();
                    while (!validGuess) {
                        // .matches(regex) doesn't require "+" because the String will always be forced to be a single character
                        if (Guess.matches("[a-zA-Z]")) {
                            if (guessCount == 0) {
                                // System.out.println("First guess"); Enable to check if guessCount is indeed 0 at this point to break out early
                                validGuess = true;
                            } else {
                                for (int i = 0; i < arrayGuesses.length; i++) {
                                    if (Guess.charAt(0) == arrayGuesses[i]) {
                                        matchCount++;
                                    }
                                }
                                if (matchCount == 0) {
                                    validGuess = true;
                                } else {
                                    System.out.println("Guess already made for this character");
                                    System.out.println("Please provide a guess:");
                                    Guess = input.nextLine();
                                    Guess = Guess.toLowerCase();
                                    matchCount = 0;
                                }
                            }
                        } else {
                            // The false of the if that makes sure input is always a single character
                            System.out.println("Only use a single character [a-z] or [A-Z]");
                            System.out.println("Please provide a guess:");
                            Guess = input.nextLine();
                            Guess = Guess.toLowerCase();
                            matchCount = 0;
                        }
                    }
                    validGuess = false; // Reset validGuess for next turn, move to end later with other variables to reset

                    matchCount = 0;
                    for (int i = 0; i < arrayHangman.length; i++) {
                        // Matches and updates arrayHangman, including UpperCase to LowerCase and vice versa
                        if (Guess.charAt(0) == arrayWord[i] || Guess.charAt(0) == Character.toUpperCase(arrayWord[i]) || Character.toUpperCase(Guess.charAt(0)) == arrayWord[i]) {
                            arrayHangman[i] = arrayWord[i];
                            matchCount++;
                        }
                    }

                    // Updates player on lives left, with inline if to subtract a life if the last guess was incorrect and so livesLeft is ready for checking at the end of the while loop
                    System.out.println("You have " + (matchCount == 0 ? --livesLeft : livesLeft) + " lives left");
                    System.out.println("The hangman word currently is: " + Arrays.toString(arrayHangman));
                    if (guessCount >= 1) {
                        guessesTemp = new char[arrayGuesses.length + 1];
                        for (int i = 0; i < arrayGuesses.length + 1; i++) {
                            if (arrayGuesses.length > i) {
                                guessesTemp[i] = arrayGuesses[i];
                            } else {
                                guessesTemp[i] = Guess.charAt(0);
                            }
                        }
                        arrayGuesses = new char[guessesTemp.length]; // Recreates arrayGuesses length (now +1 as previous loop) from guessesTemp
                        for (int i = 0; i < (arrayGuesses.length); i++)
                            arrayGuesses[i] = guessesTemp[i]; // Updates arrayGuesses from guessesTemp for use in the next loop
                        // System.out.println(Arrays.toString(arrayGuesses) + " has been rebuilt from " + Arrays.toString(guessesTemp)); // Enable to check if rebuilt array is correct
                    } else {
                        arrayGuesses[0] = Guess.charAt(0);
                    }
                    guessCount++;

                    System.out.println("Your guesses so far have been " + Arrays.toString(arrayGuesses));
                    // Comparing arrays, whether with == or with .equals() doesnt seem to work, thus parsing them both as String to compare with .equals()
                    if (Arrays.toString(arrayHangman).equals(Arrays.toString(arrayWord))) {
                        System.out.println("You win the round!");
                        roundEnd = true;
                    } else if (livesLeft == 0) {
                        System.out.println("You have lost the round!");
                        roundEnd = true;
                    } else {
                        // Round loops back for a new turn
                        System.out.println("Please provide a guess:");
                    }
                    matchCount = 0;
                }
                gameEnd = true;
            }
        }
    }
}