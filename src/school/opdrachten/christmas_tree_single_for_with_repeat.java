package school.opdrachten;

import java.util.Scanner;

public class christmas_tree_single_for_with_repeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of your tree");
        int treeSize = input.nextInt(); // size of tree in number of lines, still works after 10+, but shape looks weird, could be fixed with a nested if to prefix all digits smaller than treeSize with a number of extra blank spaces
        // Loops from 1 through treeSize
        for (int lineCount = 1; lineCount <= treeSize; lineCount++) {
            int reducer = 1; // Reduces a number, cannot exceed counter has to be between 0 and less or equal to repeater
            int repeater = 2; // Repeated number of counter
            // .repeat() used to replace nested for loop, makes it easier to instantly print a repeated string on the same line
            System.out.println(" ".repeat(treeSize - lineCount) + String.valueOf(lineCount).repeat(lineCount * repeater - reducer));
        }
    }
}