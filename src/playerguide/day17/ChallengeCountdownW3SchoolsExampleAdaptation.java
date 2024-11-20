package playerguide.day17;

/*
To practice a little more, i adapted the w3-schools example from:
// This adds all numbers from 10 to 0 = 55
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
to: See below
*/

import java.util.Scanner;

public class ChallengeCountdownW3SchoolsExampleAdaptation {

    static String i = "";
    static int k = 0;
    static int number;
    static String direction;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a value to count with");
            number = input.nextInt();
            input.nextLine();

            System.out.println("Should it count up, down or let it do both for a strange spectrum!");
            direction = input.nextLine();

            // Input for sum method, number for recursion steps checked on the if and to break when depleted, direction to determine the up or down
            sum(number, direction);
        }
        public static void sum(int k, String i) {
            if (k <= 0) {
                return; // return stripped of value, so that static int becomes void
            }
            /*
            sum(k - 1);
            Question, Why does placing this before the System.out.println(k) make the result count from 1 to 10, but after its 10 to 1?
            Answer: Where the System.out.println(k) is placed determines the order of execution:
            If it’s before the recursive call, the program prints the value before making the recursive call.
            If it’s after the recursive call, it prints the value after all recursive calls have been completed and the stack starts unwinding.
            System.out.println(k);
            sum(k - 1);
            */
            if (i.equals("up")) {
                sum(k - 1, i);
                System.out.println(k);
            } else if (i.equals("down")) {
                System.out.println(k);
                sum(k - 1, i);
            } else if (i.equals("both")) {
                sum(k - 1, i);
                System.out.println(k);
                sum(k - 1, i); // This is hella weird, i dont understand... for now, seems like an interesting pattern that occurs
            } else {
                System.out.println("Try again, but make it count up or down");
            }
        }
    }
