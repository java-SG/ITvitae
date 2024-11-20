package playerguide.day17;

/*
Day 17 Challenge: Challenge Countdown

Hint: try read a bit about ‘recursion’

The Council of Freach has summoned you. New writing has appeared on the Tomb of Algol the Wise, the
last True Programmer to wander this land. The writing strikes fear and awe into the hearts of the looploving people of Freach: “The next True Programmer shall be able to write any looping code with a
method call instead.” The Senior Counselor, scared of a world without loops, asks you to put your skill to
the test and rewrite the following code, which counts down from 10 to 1, with no loops:

for (int x = 10; x > 0; x--)
 System.out.println(x);
*/

/* Used chatGPT for this given I could not understand how to apply "recursion"
   Seems to me its more of a way of letting code run rather than a specific function/method
   It still just seems like a slightly bigger variant of a while loop, without any real pro's
   But that's most likely because of the lack of depth in this particular code
   A void method does seem interesting for cleaner code though
*/

public class ChallengeCountdown {
    // Countdown method
    public static void countdown(int x) {
        // Isolates the return to only break when x is depleted, returns nothing since System prints are from the method itself, also why it can be a static void method in this case
        if (x <= 0) {
            return;
        }

        // Prints whatever x is at this point
        System.out.println(x);

        // Does something to x, -1 in this case, still seems much more complex than the for (int x = 10; x > 0; x--) needed to be, but it'll come back later i guess
        countdown(x - 1);
    }

    public static void main(String[] args) {
        //
        countdown(10);
    }
}
