package school.opdrachten;

public class primitives {
    public static void main(String[] args) {
        // These are the initialized primitives
        char a; // ' ' to initialize an empty char or with \u0000 for a null, if '' is used, it will result in a compile error
        byte b;
        short c;
        int d;
        long e;
        float f;
        double g;
        boolean h;

        // These are the declared literal values
        a = 'x';
        b = 100;
        c = 250;
        d = 999;
        e = 9001;
        f = 1.618f;
        g = 1.618033d;
        h = true;

        // Test print to check all primitives can be initialized separately from declaration
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n" + h);
    }
}
