package playerguide.day09;

/*
Day 9: Challenge - Repairing the Clocktower

The recent attacks damaged the great Clocktower of Consolas. The citizens of Consolas have repaired
most of it, except one piece that requires the steady hand of a Programmer. It is the part that makes the
clock tick and tock. Numbers flow into the clock to make it go, and if the number is even, the clock’s
pendulum should tick to the left; if the number is odd, the pendulum should tock to the right. Only a
programmer can recreate this critical clock element to make it work again.

Objectives:
Take a number as input from the console.
Display the word “Tick” if the number is even. Display the word “Tock” if the number is odd.
Hint: Remember that you can use the remainder operator to determine if a number is even or odd.
*/

// importing the Java Scanner utility for user input

import java.util.Scanner;

public class RepairingTheClocktower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an input number:");
        float inputValue = input.nextFloat();

        // String result initialized in not neccessary given it's being used always in the sout(), but it is recommended.
        String result = "";

        if (inputValue % 2 == 0) {
            result = "Tick";
        } else {
            result = "Tock";
        }
        ;
        System.out.println(result);
    }
}