package school.opdrachten;

import java.util.Scanner;

public class geheel_positief {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isPositive = false;
        int inputValue = 0;

        while (!isPositive) {
            System.out.println("Enter a positive integer value:");
            inputValue = input.nextInt();
            if (inputValue > 0) {
                isPositive = true;
            } else {
                System.out.println("Input was negative! Try again");
            }
        }

        int a = 0;
        int b = 0;

        for (int x = inputValue; x > 0; x--) {
            if (x % 2 == 0) {
                a += x;
            } else {
                b += x;
            }
        }

        System.out.println("Input whole value = " + inputValue);
        System.out.println("Sum of even numbers till " + inputValue + " = " + a);
        System.out.println("Sum of uneven numbers till " + inputValue + " = " + b);
        System.out.println("Difference between sums = " + (b - a));

    }
}
