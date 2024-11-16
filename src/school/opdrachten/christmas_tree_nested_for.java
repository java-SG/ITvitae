package school.opdrachten;

import java.util.Scanner;

public class christmas_tree_nested_for {
    public static void main(String[] args) {
        // Christmas tree with nested for loops
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines do you want the tree?");
        int treeSize = input.nextInt(); // Number of lines to print
        int startNumber = 1; // Was going to make it so you can start at a higher number but this automatically makes the tree shorter due to the for loop set up
        int branchLength = 1; // Was going to make it so you can change the branch length (number of repeated numbers equal on each side) but couldnt figure out how to force the first one to start a single number without writing an exception
        String toPrint;
        for (int lineCount = 1; lineCount <= treeSize; lineCount++) {
            toPrint = ""; // To wipe the toPrint variable clean for each loop
            // Loop that determines the amount of repeats for spaces that needs to be made (declining)
            for (int spaces = (treeSize - lineCount); spaces > 0; spaces--) {
                toPrint += " ";
            }
            // Loop that determines the amount of repeats for numbers that needs to be made (inclining)
            for (int numbers = startNumber; numbers <= ((lineCount * branchLength) + (lineCount - 1)); numbers++) {
                toPrint += lineCount; // String.valueOf() not required since toPrint is always declared as String and initialized with ""; therefore any concatenated value to toPrint is parsed as String
            }
            System.out.println(toPrint); // Prints the built String of toPrint from the 2 nested for loops (spaces + numbers), prints only 1 line per loop (cleaner)
        }
    }
}