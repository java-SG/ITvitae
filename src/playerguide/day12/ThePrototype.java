package playerguide.day12;

/*
Day 12 Challenge: The Prototype

Mylara, the captain of the Guard of Consolas, has approached you with the beginnings of a plan to hunt
down The Uncoded One’s airship. “If we’re going to be able to track this thing down,” she says, “we need
you to make us a program that can help us home in on a location.” She lays out a plan for a program to
help with the hunt. One user, representing the airship pilot, picks a number between 0 and 100. Another
user, the hunter, will then attempt to guess the number. The program will tell the hunter that they
guessed correctly or that the number was too high or low. The program repeats until the hunter guesses
the number correctly. Mylara claims, “If we can build this program, we can use what we learn to build a
better version to hunt down the Uncoded One’s airship.”

Sample Program:

User 1, enter a number between 0 and 100: 27
After entering this number, the program should clear the screen and continue like this:
User 2, guess the number.
What is your next guess? 50
50 is too high.
What is your next guess? 25
25 is too low.
What is your next guess? 27
You guessed the number!

Objectives:

    Build a program that will allow a user, the pilot, to enter a number.
    If the number is above 100 or less than 0, keep asking.
    Clear the screen once the program has collected a good number (you can just write 50 blank lines to clear the screen :) ).
    Ask a second user, the hunter,to guess numbers.
    Indicate whether the user guessed too high, too low, or guessed right.
    Loop until they get it right, then end the program.
*/

import java.util.Scanner;

public class ThePrototype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ...
        System.out.println("Pilot, enter a number between 0 and 100:");
        int theNumber = input.nextInt();
        int theGuess;
        int guessCount = 0;
        int guessLimit = 10;

        // Doesnt clear the console, but enough to clear the screen
        for (int i = 0; i <= 50; i++) {
            System.out.println();
        }

        // Do-while with nested if loop including guess counter with limit
        do {
            System.out.println("Hunter, guess the number between 0 and 100:");
            theGuess = input.nextInt();
            guessCount++;
            // Returns if User's 2 input is correct or too high/low, isolates break for the specific case when it is correct and when the guessLimit is reached
            if (theGuess == theNumber) {
                System.out.println("Correct!");
                break;
            } else if (theGuess < theNumber && guessCount < guessLimit) {
                System.out.println("Too low!");
            } else if (theGuess > theNumber && guessCount < guessLimit) {
                System.out.println("Too high");
            } else {
                System.out.println("You ran out of guesses!\nGame Over!");
                break;
            }
        } while (theGuess >= 0 && theGuess <= 100);

        System.out.println("You have guessed the number after " + guessCount + " guesses.");
    }
}
