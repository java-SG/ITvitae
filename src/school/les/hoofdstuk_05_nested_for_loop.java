package school.les;

import java.util.Scanner;

public class hoofdstuk_05_nested_for_loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What table to print?");
        int tableOf = input.nextInt();

        String megaString = "";
        String topMsg = "";
        int maxValueLength = Integer.toString(tableOf).length();
        int maxValueSquaredLength = Integer.toString((tableOf * tableOf)).length();

        System.out.println(maxValueLength);

        for (int i = 1; i <= tableOf; i++) {
            // maxValueSize + 2 = to allow the max size between values with a ", " between every value up to the last one for each line
            topMsg += " ".repeat(maxValueSquaredLength - Integer.toString(i).length()) + i + " ".repeat(2);
        }
        System.out.println(" ". repeat(Integer.toString(tableOf).length() - 1) + "* |" + topMsg);
        System.out.println("-".repeat((" ". repeat(Integer.toString(tableOf).length() - 1) + "* |" + topMsg).length() - 2));
        for (int i = 1; i <= tableOf; i++) {
            megaString += " ".repeat(maxValueLength - Integer.toString(i).length()) + i + " |";
            for (int n = 1; n <= tableOf; n++) {
                megaString += " ".repeat(maxValueSquaredLength - Integer.toString((i * n)).length()) + (i * n) + (n < tableOf ? ", " : "");
            }
            megaString += "\n";
        }
        System.out.println(megaString);
        System.out.println("Your String is currently " + megaString.length() + " characters long.");
    }
}
