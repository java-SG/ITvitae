package school.les;

import java.util.Arrays;
import java.util.Scanner;

// Class should be called PrintArray but this is how i organize my .java for classes so deal with it
public class hoofdstuk_04_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] NUM_ITEMS = {0};
        int arraySize;
        int arrayInput;

        for (int i = 0; i < 1; i++) {
            arraySize = input.nextInt();
            if (arraySize > 0) {
                NUM_ITEMS = new int[arraySize];
                i = 1;
            } else {
                System.out.println("Input needs to be a positive integer of 1 or higher!\nTry again.");
                --i;
            }
        }

        for (int i = 0; i < NUM_ITEMS.length; i++) {
            System.out.println(Arrays.toString(NUM_ITEMS));
            NUM_ITEMS[i] = input.nextInt();
        }

        for (int i = 0; i < NUM_ITEMS.length; i++) {
            System.out.println("*".repeat(NUM_ITEMS[i]) + "(" + NUM_ITEMS[i] + ")");
        }

        System.out.println("the final array: " + Arrays.toString(NUM_ITEMS));
    }
}
