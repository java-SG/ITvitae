package school.opdrachten;

import java.util.Scanner;

public class practice_with_methods {

    static double exponent; // Declare variable for public access
    static boolean validate; // Declare variable for public access
    static String isOddText; // Part of final print for uneven or even result

    public static void main(String[] args) {

        // To get input
        Scanner input = new Scanner(System.in);

        // Get input
        System.out.println("Enter the base value");
        int base = input.nextInt();
        System.out.println("Now enter the power value");
        int power = input.nextInt();

        /*
        // Process returned value of first method through second method, should this be done inside the second method? Seems inconvenient this way.
        if (!isOdd(exponent)) {
            isOddText = "un" + isOddText;
        }
        */

        // Print output
        System.out.println("Base value = " + base + "\n" + "and Exponent value = " + power + "\n" + base + " to the power of " + power + " = " + (int) exponentMethod(base, power));
        System.out.println("The base("+ base + ") to the power of exponent(" + power + ") value is " + isOdd(exponent));
    }

    // Do exponent; return exponent
    static double exponentMethod(int base, int power) {
        exponent = Math.pow(base, power);
        return exponent;
    }

    // Do validate; get validate
    static String isOdd(double exponent) {
        // Checks if remainder is 0 or 1, then updates boolean before returning boolean to called method
        if (exponent % 2 == 0) {
            isOddText = "even";
        } else {
            isOddText = "uneven";
        }
        return isOddText;
    }
}
