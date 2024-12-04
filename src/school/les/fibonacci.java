package school.les;

// 52nd number of fibonacci = 32951280099

public class fibonacci {
    public static void main(String[] args) {

        /* One line that also works, had to initiate startTime at for-statement1, but place the endtime without declaring in the actual print to correctly set the scope from start to finish
        This one is slower because it also times the time it takes to actually print the result
        */
        for (long startTime = System.nanoTime(), i = 0, a = 0, b = 1, c = 0, nFibonacci = 52; i <= (nFibonacci - 1); i++, c = b, b += a, a = c) System.out.print((i == (nFibonacci - 1)) ? (b + ", that took " + (System.nanoTime() - startTime) + " nanoseconds!") : "");

        System.out.println(); // Due to having to use print() in the one-liner to print empty spaces to make the one-liner work this way
        long startTime = System.nanoTime();
        int nFibonacci = 52; // The nth number of Fibonacci in the Fibonacci sequence
        long a = 0; // The value used to calculate every next b
        long b = 1; // This will be value of Fibonacci at number nFibonacci, starting at 1,1,2,etc
        long c; // The value to temporarily store the previous Fibonacci value, which is then copied back to a for the next loop
        // i <= (nFibonacci - 2) to make sure the sequence starts at the second Fibonacci number, which for the one-liner strangely deviates now that i look at it again
        for (int i = 0; i <= (nFibonacci - 2); i++) {
            c = b; // Temporarily stores Fibonacci[n] of the previous loop
            b += a; // Fibonacci[n] + Fibonacci[n-1]
            a = c; // Updates the Fibonacci[n-1] for next loop
        }
        long endTime = System.nanoTime();
        System.out.println(b + ", that took " + (endTime - startTime) + " nanoseconds!");
    }
}