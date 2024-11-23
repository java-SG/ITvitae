package school.les;

import java.util.Scanner;
import java.util.Arrays;

public class hoofdstuk_03_eindopdracht {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Boolean inputValid = false;
        int natuurlijkGetal = -1;
        while (!inputValid) {
            System.out.println("Enter a number as natural number (integer):");
            if (input.hasNextInt()) {
                natuurlijkGetal = input.nextInt();
                inputValid = true;
            } else {
                System.out.println("That is not an integer!");
                input.next(); // Avoids infinite loop, catches whatever doesnt fit an integer
            }
        }

        System.out.println("The first " + natuurlijkGetal + " lucas numbers are:");
        hoofdstuk_03_methode methode = new hoofdstuk_03_methode(natuurlijkGetal);

        int[] lucasGetallenBerekend = new int[50];
        lucasGetallenBerekend[0] = 2;
        lucasGetallenBerekend[1] = 1;
        boolean stopGoing = false;
        int n = 2;
        while (!stopGoing) {
            lucasGetallenBerekend[n] = lucasGetallenBerekend[n - 1] + lucasGetallenBerekend[n - 2];
            if (lucasGetallenBerekend[n] < 0) {
                System.out.println(lucasGetallenBerekend[n - 1] + " is the " + n + "th and final integer within range of Integer values for lucas numbers.");
                break;
            }
            n++;
        }

        // boolean as !scanner.hasNextInt() useful

        /*
        boolean stopGoing = false;
        int n = 2;
        int x = 1;
        while (!stopGoing) {
            n = n + x;
            if (n < 0) {
                System.out.println(x + " is the final Integer within range of Integer values for lucasNumbers");
                break;
            }
            System.out.println();
            x = n;
        }
        */
    }
}
