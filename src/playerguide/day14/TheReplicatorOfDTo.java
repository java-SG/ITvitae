package playerguide.day14;

/*
Day 14 Challenge: Challenge The Replicator of D’To

While searching an abandoned storage building containing strange code artifacts, you uncover the
ancient Replicator of D’To. This can replicate the contents of any int array into another array. But it
appears broken and needs a Programmer to reforge the magic that allows it to replicate once again.

Objectives:

    Make a program that creates an array of length 5.
    Ask the user for five numbers and put them in the array.
    Make a second array of length 5.
    Use a loop to copy the values out of the original array and into the new one.
    Display the contents of both arrays one at a time to illustrate that the Replicator of D’To works again.
*/

import java.util.Scanner;
import java.util.Arrays;

public class TheReplicatorOfDTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Can be changed to an input if you want to make this array length variable
        String arrayLength = "";
        for (int i = 0; i < 1; i++) {
            System.out.println("How long should the array be?");
            arrayLength = input.nextLine();
            if (arrayLength.matches("[0-9]")) {
                i = 1;
            } else {
                --i; // Causes i to remain -1 until the if statement becomes true, i * 0 is not allowed due to infinite loop risk, but this is basically the same, up yours java
                // System.out.println(i);
            }
        }
        // Assigns the length of the array as per arrayLength variable
        int[] numbersOriginal = new int[Integer.valueOf(arrayLength)];

        // Start program, first array (original)
        System.out.println("Please enter the " + arrayLength + " integers from the original array one by one:");

        // Loops from 0 through max.length of the array, replacing the next integer with every loop (default=0 as is printed), checked if applied correctly with every loop
        for (int i = 0; i < numbersOriginal.length; i++) {
            System.out.println("Enter the next integer " + Arrays.toString(numbersOriginal));
            numbersOriginal[i] = input.nextInt();
        }
        // Shows the array has been successfully entered
        System.out.println("The array is now set to: " + Arrays.toString(numbersOriginal));

        // Replicator is booting up, nothing functional, just for fun
        System.out.print("The replicator is booting up");
        // Used chatGPT for the sleep function, wasnt sure why it requires a try-catch, but i thought it would look cool for this assignment at least
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000); // Goes to sleep for x milliseconds
            } catch (InterruptedException e) {
                System.out.println("The replicator crashed!");
            }
            System.out.print(".");
        }
        System.out.println();
        // Copies the length of the original array as lenght of the replicated array
        int[] numbersReplicator = new int[numbersOriginal.length];
        System.out.println("The replicator has succesfully booted up and is set to: " + Arrays.toString(numbersReplicator));

        // Second array (replicator)
        System.out.println("The original array is: " + Arrays.toString(numbersOriginal));
        System.out.print("The replicator is executing");
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The replicator crashed!");
            }
            System.out.print(".");
        }
        System.out.println();
        // Loops through the replicator array but instead of user input now loops through the original array to copy every integer one by one until the array is completely copied
        for (int i = 0; i < numbersReplicator.length; i++) {
            numbersReplicator[i] = numbersOriginal[i];
            System.out.println(((i < numbersReplicator.length - 1) ? "Replicating original array: " : "The replicated array is now set to: ") + Arrays.toString(numbersReplicator));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("The replicator crashed!");
            }
        }
        System.out.println((Arrays.equals(numbersOriginal, numbersReplicator)) ? "The replication process was a success!" : "The replication process has failed!");
    }
}
