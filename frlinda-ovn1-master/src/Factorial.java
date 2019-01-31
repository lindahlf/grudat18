//Fred Lindahl, grudat18, uppg 1.2
/**
* This program calculates the factorial for some given positive integer.
*/
public class Factorial {
    /**
     * Takes some integer n as input and returns itself recursively.
     */
    public static long calculation(int n) {

        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 1 || n == 0) return 1;

        return n * calculation(n - 1);

    }
}

