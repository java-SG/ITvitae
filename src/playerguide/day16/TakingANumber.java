package playerguide.day16;

/*
Day 16 Challenge: Taking a Number

Many previous tasks have required getting a number from a user. To save time writing this code
repeatedly, you have decided to make a method to do this common task.

Objectives:

    Make a method with the signature int askForNumber(String text). Display the text parameter in the console window, get a response from the user, convert it to an int, and return it.
    This might look like this: int result = askForNumber(“What is the airspeed velocity
    of an unladen swallow?”);.
    Make a method with the signature int askForNumberInRange(String text, int min, int max). Only return if the entered number is between the min and max values. Otherwise, ask again.
    Place these methods in at least one of your previous programs to improve it.
*/

import java.util.Scanner;

public class TakingANumber {

    static String text = "";
    static int min = 50; // Minimum airspeed velocity of an unladen swallow
    static int max = 120; // Maximum airspeed velocity of an unladen swallow
    static int airspeed = 0;

    // Main class
    public static void main(String[] args) {
        airspeed = askForNumber(text, min, max);
        System.out.println("The airspeed velocity of an unladen swallow is " + airspeed);
    }

    // Method class
    static int askForNumber(String text, int min, int max) {
        // Converts String to text, doesnt seem very useful as method in this assignment
        Scanner input = new Scanner(System.in);
        System.out.println("What is the airspeed velocity of an unladen swallow?");
        text = input.nextLine();
        int value = Integer.parseInt(text);
        int i = 0;
        while (i == 0) {
            if (value >= min && value <= max) {
                i = 1;
                break;
            } else {
                System.out.println("What is the airspeed velocity of an unladen swallow?");
                text = input.nextLine();
                value = Integer.parseInt(text);
            }
        }
        return value;
    }
}
