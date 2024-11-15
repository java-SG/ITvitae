package school.opdrachten;

public class modulo_explained {
    public static void main(String[] args) {
        double x = 234;
        double i = 17;

        // a uses Modulo, b uses (division - integer) remainder decimals multiplied by divisor (i)
        double a = x % i; // ideal
        double b = ((x / i - Math.floor(x / i)) * i); // has an internal rounding issue with doubles getting rounded, e.g. if x=401; i=27, 401/27=0.85185, but Double will round it to 0.85 internally, for whatever reason and thus requires BigDecimal, which requires an import of BigDecimal and also uses much much more memory

        int y = 234;
        int n = 17;

        int c = y - y / n * n; // this works the same as modulo, easier to understand but more writing

        /* Always prints the same
        Conclusion: x % i = ((x / i - Math.floor(x / i)) * i), but using modulo is more readible (if you understand module of course) and allows the usage of int instead of forcing you to use doubles before casting them back to ints (if the desired result is an integer)
        Note: for x % i, divisor (i) can never be 0, same as the latter where you can not divide by zero by default
         */
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(c);
    }
}
